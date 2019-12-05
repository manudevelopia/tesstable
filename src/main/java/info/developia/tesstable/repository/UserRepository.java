package info.developia.tesstable.repository;

import info.developia.tesstable.model.User;

public interface UserRepository {
    User getBy(String email);
}
