package practice;

import java.time.LocalDateTime;

public class User {

    private int id;
    private String username;
    private String email;
    private String passwordHash;
    private LocalDateTime createdAt;

    public User(int id, String username, String email, String passwordHash, LocalDateTime createdAt) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.passwordHash = passwordHash;
        this.createdAt = createdAt;
    }

    public int getId() { return id; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
}
