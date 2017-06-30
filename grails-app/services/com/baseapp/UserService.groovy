package com.baseapp

import grails.transaction.Transactional

class UserService {

  void assignRoleToUser(User user, Role role) {
    UserRole.create user, role
  }

  @Transactional
  User saveUser(User user) {
    user.save()
  }

  List<User> getListUsers(Map params) {
    User.list(max:params.max ?: 20, offset:params.offset ?: 0)
  }

}
