package com.baseapp

import spock.lang.Specification
import spock.lang.Unroll
import grails.test.mixin.TestFor
import grails.test.mixin.Mock

@TestFor(UserService)
@Mock([User, Role, UserRole])
class UserServiceSpec extends Specification {

  void "Should save a user"() {
    given:"A instance of user"
      User user = new User(username:"username", password:"password")
    when:
      User result = service.saveUser(user)
    then:
      result.id
  }

  @Unroll
  void "Should obtain the users list"() {
    given:"The existing users"
      User user1 = new User().save(validate:false)
      User user2 = new User().save(validate:false)
      User user3 = new User().save(validate:false)
      User user4 = new User().save(validate:false)
      User user5 = new User().save(validate:false)
      User user6 = new User().save(validate:false)
      User user7 = new User().save(validate:false)
    and:"The params"
      Map params = theParams
    when:
      List<User> result = service.getListUsers(params)
    then:
      result.size() == sizeList
    where:
    theParams          || sizeList
    [:]                || 7
    [max:3]            || 3
    [max:3, offset:3]  || 3
  }

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
