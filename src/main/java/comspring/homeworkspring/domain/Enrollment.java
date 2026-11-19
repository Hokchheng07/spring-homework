package comspring.homeworkspring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "enrollments")

public class Enrollment {

    @Id
    private Integer id;

    private LocalDateTime enrolledAt;

    private LocalDateTime paymentAt;

    private String paymentMethod;

    private Boolean paymentStatus;

    @ManyToOne
    private Course course;

    @ManyToOne
    private Student student;
}
