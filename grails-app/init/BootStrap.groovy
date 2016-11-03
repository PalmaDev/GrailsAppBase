import com.siscaim.Role
import com.siscaim.User
import com.siscaim.UserRole

class BootStrap {

    def init = {
      def superRole = new Role(authority: 'SUPER_USER').save()

      def superUser = new User(username: 'superUser', password: 'superUser').save()

      UserRole.create superUser, superRole

      UserRole.withSession {
        it.flush()
        it.clear()
      }

      assert User.count() == 1
      assert Role.count() == 1
      assert UserRole.count() == 1
    }

    def destroy = {
    }
}
