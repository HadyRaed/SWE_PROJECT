
public abstract class User {

    private String userName;
    private String password;
    private String email;

    User(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;

    }

    String getUserName() {
        return userName;

    }

    String getPassword() {
        return password;

    }

    String getEmail() {
        return email;

    }
}
