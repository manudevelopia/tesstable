package tesstable.model;

public class UserService {
    private static UserRepository userRepositoryStatic;
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getByPublic(String email) {
        return userRepository.getBy(email);
    }

    public static User getByPublicStatic(String email) {
        return userRepositoryStatic.getBy(email);
    }

    private User getByPrivate(String email) {
        return userRepository.getBy(email);
    }

    private static User getByPrivateStatic(String email) {
        return userRepositoryStatic.getBy(email);
    }
}
