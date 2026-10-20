package model;

public class User {
    private String userId;
    private String username;
    private String password;
    private String name;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
    }

    public User(String userId, String username, String password, String name) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.name = name;
    }

    // Generated getters and setters
}
