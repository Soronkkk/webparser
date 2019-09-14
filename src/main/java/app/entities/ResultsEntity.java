package app.entities;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Objects;
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

    @Column(name = "USER_ID", nullable = false)
    private Long user_id;

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

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultsEntity that = (ResultsEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(page, that.page) &&
                Objects.equals(words_quantity, that.words_quantity) &&
                Objects.equals(user_id, that.user_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, page, words_quantity, user_id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ResultsEntity{");
        sb.append("id=").append(id);
        sb.append(", page='").append(page).append('\'');
        sb.append(", words_quantity='").append(words_quantity).append('\'');
        sb.append(", user_id=").append(user_id);
        sb.append('}');
        return sb.toString();
    }
}
