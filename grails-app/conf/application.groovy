grails.views.default.codec = "html"
grails.views.gsp.encoding = "UTF-8"
grails.converters.encoding = "UTF-8"
grails.plugin.databasemigration.updateOnStart = true
grails.plugin.databasemigration.updateOnStartFileNames = ['changelog.groovy']

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.baseapp.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.baseapp.UserRole'
grails.plugin.springsecurity.authority.className = 'com.baseapp.Role'

grails.plugin.springsecurity.logout.postOnly = false
grails.plugin.springsecurity.password.algorithm = 'SHA-256'

grails.plugin.springsecurity.successHandler.defaultTargetUrl = '/dashboard'
grails.plugin.springsecurity.securityConfigType = "InterceptUrlMap"

grails.plugin.springsecurity.interceptUrlMap = [
[pattern: '/',                access: ['permitAll']],
[pattern: '/error',           access: ['permitAll']],
[pattern: '/index',           access: ['permitAll']],
[pattern: '/index.gsp',       access: ['permitAll']],
[pattern: '/shutdown',        access: ['permitAll']],
[pattern: '/assets/**',       access: ['permitAll']],
[pattern: '/**/js/**',        access: ['permitAll']],
[pattern: '/**/css/**',       access: ['permitAll']],
[pattern: '/**/images/**',    access: ['permitAll']],
[pattern: '/**/favicon.ico',  access: ['permitAll']],
[pattern: '/login',           access: ['permitAll']],
[pattern: '/login/**',        access: ['permitAll']],
[pattern: '/logout',          access: ['IS_AUTHENTICATED_FULLY']],
[pattern: '/logout/**',       access: ['IS_AUTHENTICATED_FULLY']],
[pattern: '/dashboard/**',       access: ['IS_AUTHENTICATED_FULLY']],
[pattern: '/user/**',       access: ['IS_AUTHENTICATED_FULLY']]
]


