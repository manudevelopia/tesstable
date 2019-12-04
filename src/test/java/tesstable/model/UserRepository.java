package tesstable.model;

public interface UserRepository {
    User getBy(String email);
}
