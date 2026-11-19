package comspring.homeworkspring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
@Table(name = "enrollments")

public class Enrollment {

    @Id
    private Integer id;

    private LocalDate enrolled_at;

    private LocalDate payment_at;

    private String paymentMethod;

    private Boolean payment_status;

    @ManyToOne
    private Course course;

    @ManyToOne
    private Student student;
}
