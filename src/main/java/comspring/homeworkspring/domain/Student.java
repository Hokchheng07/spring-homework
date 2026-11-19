package comspring.homeworkspring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "students")

public class Student {

    @Id
    private String id;

    private String biography;

    private String facebook_link;

    private String github_link;

    private String major;

    private String phoneNumber;

    private String university;

    @OneToMany(mappedBy = "enrollment")
    private List<Enrollment> enrollmentList;
}
