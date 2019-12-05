package info.developia.tesstable.model

import info.developia.tesstable.model.User
import info.developia.tesstable.repository.UserRepository
import info.developia.tesstable.service.UserService
import info.developia.tesstable.service.UserServiceImpl
import spock.lang.Specification

class UserServiceMockTest extends Specification {

    UserRepository userRepository = Mock(UserRepository)
    UserService userService = new UserServiceImpl()
    User user = new User(name: "Jason Bourne", email: "jason@bourne.com")

    def setup() {
        userService.@userRepository = userRepository
        userService.@userRepositoryStatic = userRepository
    }

    def "getByPublic"() {
        given:
        String email = "janedoe@user.info"
        userRepository.getBy(email) >> user

        when:
        User result = userService.getByPublic(email)

        then:
        with(result) {
            name:
            user.getName()
            email:
            user.getEmail()
        }
    }

    def "getByPublicStatic"() {
        given:
        String email = "janedoe@user.info"
        userRepository.getBy(email) >> user

        when:
        User result = userService.getByPublicStatic(email)

        then:
        with(result) {
            name:
            user.getName()
            email:
            user.getEmail()
        }
    }

    def "getByPrivate"() {
        given:
        String email = "janedoe@user.info"
        userRepository.getBy(email) >> user

        when:
        User result = userService.getByPrivate(email)

        then:
        with(result) {
            name:
            user.getName()
            email:
            user.getEmail()
        }
    }

    def "getByPrivateStatic"() {
        given:
        String email = "janedoe@user.info"
        userRepository.getBy(email) >> user

        when:
        User result = userService.getByPrivateStatic(email)

        then:
        with(result) {
            name:
            user.getName()
            email:
            user.getEmail()
        }
    }
}
