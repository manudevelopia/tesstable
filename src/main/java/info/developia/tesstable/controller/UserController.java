package info.developia.tesstable.controller;

import info.developia.tesstable.model.User;
import info.developia.tesstable.repository.UserRepository;
import info.developia.tesstable.repository.UserRepositoryImpl;
import info.developia.tesstable.service.UserService;
import info.developia.tesstable.service.UserServiceImpl;

public class UserController {
    private UserRepository userRepository = new UserRepositoryImpl();
    private UserService userService = new UserServiceImpl(userRepository);

    public User getUser(String email){
        return userService.getByPublic(email);
    }
}
