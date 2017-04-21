package com.baseapp

import spock.lang.Specification
import grails.test.mixin.TestFor
import grails.test.mixin.Mock

@TestFor(UserService)
@Mock([User, Role, UserRole])
class UserServiceSpec extends Specification {

  void "Should assign the role to user"() {
    given:"The user"
      User user = new User(username:"user").save(validate:false)
    and:"The role"
      Role role = new Role(authority:"the role").save(validate:false)
    when:
      service.assignRoleToUser(user, role)
    then:
      UserRole.findByUserAndRole(user, role)
  }

}
