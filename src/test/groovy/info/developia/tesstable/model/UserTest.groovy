package info.developia.tesstable.model


import spock.lang.Specification

class UserTest extends Specification {
    User user = new User()

    def "test validate Email Public"() {
        when:
        boolean result = user.validateEmailPublic("email@email.com")

        then:
        result == true
    }

    def "test validate Email Public Static"() {
        when:
        boolean result = user.validateEmailPublicStatic("email@email.com")

        then:
        result == true
    }

    def "test validate Email Private"() {
        when:
        boolean result = user.validateEmailPrivate("email@email.com")

        then:
        result == true
    }

    def "test validate Email Private Static"() {
        when:
        boolean result = user.validateEmailPrivateStatic("email@email.com")

        then:
        result == true
    }
}
