package comspring.homeworkspring.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "comments")

public class Comment {
    @Id
    private Integer id;

    private LocalDateTime createdAt;

    private Boolean isDeleted;

    private String text;

    @ManyToOne
    private Comment parent;

    @OneToMany(mappedBy = "parent")
    private List<Comment> replies;

    @ManyToOne
    private Video video;

}
