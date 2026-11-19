package comspring.homeworkspring.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "comments")

public class Comment {
    @Id
    private Integer id;

    @Column(nullable = false)
    private LocalDate created_at;

    @Column(nullable = false)
    private String text;

    @Column(nullable = false)
    private Integer parent_id;

    @Column(nullable = false)
    private Integer video_id;

}
