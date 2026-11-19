package comspring.homeworkspring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
@Table(name = "instructors")

public class Instructor {

    private String id;

    private String biography;

    private String facebookLink;

    private String githubLink;

    private String jobTitle;

    private String phoneNumber;

    @OneToMany(mappedBy = "course")
    private List<Course> course;
}
