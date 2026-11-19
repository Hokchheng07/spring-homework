package comspring.homeworkspring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
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
@Table(name = "student_profiles")

public class Student {

    @Id
    @Column(
        name = "user_id",
        nullable = false
    )
    private String user_id;

    private String biography;

    private String facebook_link;

    private String github_link;

    private String major;

    private String phone_number;

    private String university;

    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments;
}
