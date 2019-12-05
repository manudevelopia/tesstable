package info.developia.tesstable.controller

import info.developia.tesstable.model.User
import info.developia.tesstable.repository.UserRepository
import info.developia.tesstable.service.UserServiceImpl
import spock.lang.Specification

class UserControllerTest extends Specification {
    UserRepository userRepository = Mock(UserRepository)
    UserController userController = new UserController()

    def setup() {
        userController.@userRepository = userRepository
        userController.@userService = new UserServiceImpl(userRepository)
    }

    def "test get User"() {
        given:
        userRepository.getBy("name@email.com") >> new User("name", "email")

        when:
        User result = userController.getUser("name@email.com")

        then:
        with(result) {
            name: "name"
            email: "email"
        }
    }
}
