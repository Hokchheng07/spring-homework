package comspring.homeworkspring.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "instructor_profiles")

public class Instructor {

    @Id
    @Column(nullable = false)
    private String user_id;

    private String biography;

    private String facebookLink;

    private String githubLink;

    private String job_title;

    private String phone_number;

    @OneToMany(mappedBy = "instructor")
    private List<Course> courses;
}
