package com.baseapp

import grails.transaction.Transactional

@Transactional(readOnly = true)
class UserController {

  static allowMethods = [saveWithRole:"POST"]

  def userService

  def createUserAdmin(){
    render view:"createWithRole", model:[roles:[Role.findByAuthority('ADMIN')]]
  }

  @Transactional
  def saveWithRole(UserWithRoleCommand userCommand) {
    if (userCommand.hasErrors()) {
      transactionStatus.setRollbackOnly()
      render view:"createWithRole", model:[user:userCommand]
    }

    User user = userCommand.createUser()
    user.save()
    userService.assignRoleToUser(user, Role.get(userCommand.roleId))
    redirect action:"list"
  }

  def list() {
    params.max = 20
    [users:User.list(params), usersCount:User.count()]
  }
}
