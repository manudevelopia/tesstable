package info.developia.tesstable.model

import spock.lang.Specification
import tesstable.model.User
import tesstable.model.UserRepository
import tesstable.model.UserRepositoryImpl
import tesstable.model.UserService

class UserServiceTest extends Specification {

    UserService userService = new UserService()

    def setup(){
        userService.@userRepository = new UserRepositoryImpl()
        userService.@userRepositoryStatic = new UserRepositoryImpl()
    }

    def "getByPublic"() {
        given:
        String email = "janedoe@user.info"

        when:
        User result = userService.getByPublic(email)

        then:
        result.getEmail() == "janedoe@user.info"
    }

    def "getByPublicStatic"() {
        given:
        String email = "janedoe@user.info"

        when:
        User result = userService.getByPublicStatic(email)

        then:
        result.getEmail() == "janedoe@user.info"
    }

    def "getByPrivate"() {
        given:
        String email = "janedoe@user.info"

        when:
        User result = userService.getByPrivate(email)

        then:
        result.getEmail() == "janedoe@user.info"
    }

    def "getByPrivateStatic"() {
        given:
        String email = "janedoe@user.info"

        when:
        User result = userService.getByPrivateStatic(email)

        then:
        result.getEmail() == "janedoe@user.info"
    }
}
