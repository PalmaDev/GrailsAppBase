package com.baseapp

import grails.validation.Validateable

class UserWithRoleCommand implements Validateable{
  String username
  Long roleId

  static constraints = {
    username nullable:false, size:6..10
    username(blank:false,validator:{val, obj ->
      if(User.findByUsername(val)){
        return false
      }
    })
  }

  User createUser() {
    new User(username:username, password:username)
  }
}
