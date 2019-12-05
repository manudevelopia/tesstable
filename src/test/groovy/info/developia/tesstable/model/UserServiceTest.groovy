package info.developia.tesstable.model

import info.developia.tesstable.model.User
import info.developia.tesstable.repository.UserRepositoryImpl
import info.developia.tesstable.service.UserService
import info.developia.tesstable.service.UserServiceImpl
import spock.lang.Specification

class UserServiceTest extends Specification {

    UserService userService = new UserServiceImpl()

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
