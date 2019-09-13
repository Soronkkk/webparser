package app.entities;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "USERS")
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "FIRSTNAME", nullable = false)
    private String firstName;

    @Column(name = "SECONDNAME", nullable = false)
    private String secondName;

    @Column(name = "USERNAME", nullable = false)
    private String userName;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @GeneratedValue(generator = "uuid")
    @JoinColumn(name = "COOKIE", nullable = false)
    private UUID cookie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UUID getCookie() {
        return cookie;
    }

    public void setCookie(UUID cookie) {
        this.cookie = cookie;
    }
}
