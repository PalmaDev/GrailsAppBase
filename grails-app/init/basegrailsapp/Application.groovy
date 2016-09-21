package basegrailsapp

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

import org.springframework.context.EnvironmentAware
import org.springframework.core.env.Environment
import org.springframework.core.env.MapPropertySource

class Application extends GrailsAutoConfiguration implements EnvironmentAware {

  //TODO: indicar el nombre de la carpeta donde esta el file de prop, y el nombre del file de properties
  final String folderProperties = ".folderProperties"
  final String nameFileProperties = "fileProperties"

    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }

    @Override
    void setEnvironment(Environment environment) {
      def configBase = new File("${System.getProperty('user.home')}/${folderProperties}/${nameFileProperties}-${environment.activeProfiles[0]}.groovy")

      if(configBase.exists()) {
        println "Loading external configuration from Groovy: ${configBase.absolutePath}"
        def config = new ConfigSlurper().parse(configBase.toURL())
        environment.propertySources.addFirst(new MapPropertySource("externalGroovyConfig", config))
      } else {
        println "External config could not be found, checked ${configBase.absolutePath}"
      }
    }
}
