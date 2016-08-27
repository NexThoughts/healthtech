package healthtech

import grails.plugin.springsecurity.annotation.Secured


@Secured("permitAll")
class PublicController {
    def bootstrapService

    def index() {
        render bootstrapService.getRandomName() 
    }
}
