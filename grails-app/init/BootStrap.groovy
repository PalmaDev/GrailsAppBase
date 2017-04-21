import com.baseapp.Role
import com.baseapp.User
import com.baseapp.UserRole

class BootStrap {

    def init = {
      def superRole = new Role(authority: 'SUPER_USER').save()

      def superUser = new User(username: 'superUser', password: 'superUser').save()

      UserRole.create superUser, superRole

      UserRole.withSession {
        it.flush()
        it.clear()
      }

      new Role(authority:'ADMIN').save()
   }

    def destroy = {
    }
}
