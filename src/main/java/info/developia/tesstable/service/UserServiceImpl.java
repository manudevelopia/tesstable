package info.developia.tesstable.service;

import info.developia.tesstable.model.User;
import info.developia.tesstable.repository.UserRepository;

public class UserServiceImpl implements UserService {
    private static UserRepository userRepositoryStatic;
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getByPublic(String email) {
        return userRepository.getBy(email);
    }

    public static User getByPublicStatic(String email) {
        return userRepositoryStatic.getBy(email);
    }

    @Override
    public User getByPrivate(String email) {
        return userRepository.getBy(email);
    }

    private static User getByPrivateStatic(String email) {
        return userRepositoryStatic.getBy(email);
    }
}
