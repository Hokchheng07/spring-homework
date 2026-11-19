package comspring.homeworkspring.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "courses")

public class Course {

    @Id
    private Integer id;

    @Column(nullable = false)
    private Integer countRating;

    @Column(nullable = false)
    private LocalDate createdAt;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Float discountPercent;

    @Column(nullable = false)
    private Boolean isDeleted;

    @Column(nullable = false)
    private Boolean isPublished;

    @Column(nullable = false)
    private String keyword;

    @Column(nullable = false)
    private String level;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private String slug;

    private Float starRating;

    @Column(nullable = false)
    private String thumbnail;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Float totalHours;

    @Column(nullable = false)
    private LocalDate updatedAt;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Instructor instructor;

}
