package com.baseapp

import grails.transaction.Transactional

@Transactional(readOnly = true)
class UserController {

  def userService

  def list() {
    [usersList:userService.getListUsers(params), usersCount:User.count()]
  }

}
