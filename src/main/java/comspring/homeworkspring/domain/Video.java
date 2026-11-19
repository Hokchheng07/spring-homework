package comspring.homeworkspring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "videos")

public class Video {

    private Integer id;

    private String duration;

    private Boolean isDeleted;

    private Boolean isPublished;

    private String slug;

    private String thumbnail;

    private String title;

    private String youtube;

    @ManyToOne
    private Course course;

}
