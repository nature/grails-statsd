grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsCentral()
        mavenCentral()
        mavenLocal()
        //mavenRepo "http://repository.codehaus.org"
    }
    dependencies {
        test 'org.gmock:gmock:0.8.0'
        test 'org.hamcrest:hamcrest-library:1.1' // Optionally, you can use hamcrest matchers
        runtime "commons-pool:commons-pool:1.6"
        build 'commons-io:commons-io:2.4'
    }

    plugins {
        build(":release:3.0.1",
                ":rest-client-builder:1.0.3") {
            export = false
        }
    }
}
