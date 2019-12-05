package info.developia.tesstable.service;

import info.developia.tesstable.model.User;

public interface UserService {
    User getByPublic(String email);
    User getByPrivate(String email);
}
