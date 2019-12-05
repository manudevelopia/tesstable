package info.developia.tesstable.model;

public class User {
    private String name;
    private String email;

    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean validateEmailPublic(String email) {
        return email.contains("@");
    }

    public static boolean validateEmailPublicStatic(String email) {
        return email.contains("@");
    }

    private boolean validateEmailPrivate(String email) {
        return email.contains("@");
    }

    private static boolean validateEmailPrivateStatic(String email) {
        return email.contains("@");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
