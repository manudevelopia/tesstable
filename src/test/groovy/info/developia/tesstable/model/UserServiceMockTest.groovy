package info.developia.tesstable.model


import spock.lang.Specification
import tesstable.model.User
import tesstable.model.UserRepository
import tesstable.model.UserService

class UserServiceMockTest extends Specification {

    UserService userService = new UserService()
    UserRepository userRepository = Mock(UserRepository)
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
