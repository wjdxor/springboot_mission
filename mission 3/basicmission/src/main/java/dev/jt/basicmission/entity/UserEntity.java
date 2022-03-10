package dev.jt.basicmission.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    public UserEntity() {
    }

    public UserEntity(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}