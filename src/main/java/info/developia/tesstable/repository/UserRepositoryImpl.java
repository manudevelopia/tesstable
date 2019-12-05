package info.developia.tesstable.repository;

import info.developia.tesstable.model.User;

import java.util.Map;

public class UserRepositoryImpl implements UserRepository {

    private final Map<String, User> database = Map.of(
            "johndoe@user.info", new User("John Doe", "johndoe@user.info"),
            "janedoe@user.info", new User("Jane Doe", "janedoe@user.info")
    );

    public User getBy(String email) {
        return database.get(email);
    }
    
}
