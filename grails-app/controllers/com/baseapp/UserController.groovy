package com.baseapp

import grails.transaction.Transactional

@Transactional(readOnly = true)
class UserController {

  def userService

  def list() {
    params.max = 20
    [usersList:userService.getListUsers(params), usersCount:User.count()]
  }

}
