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
@Table(name = "RESULTS")
public class ResultsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "PAGE", nullable = false)
    private String page;

    @Column(name = "WORDS_QUANTITY", nullable = false)
    private String words_quantity;

    @Column(name = "COOKIE", nullable = false)
    private UUID cookie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String operation) {
        this.page = operation;
    }

    public String getWords_quantity() {
        return words_quantity;
    }

    public void setWords_quantity(String result) {
        this.words_quantity = result;
    }

    public UUID getCookie() {
        return cookie;
    }

    public void setCookie(UUID cookie) {
        this.cookie = cookie;
    }
}
