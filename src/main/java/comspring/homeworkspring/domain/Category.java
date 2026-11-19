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
@Table(name = "categories")
public class Category {

    @Id
    private Integer id;

    private String icon;

    @Column(
            nullable = false
    )
    private Boolean isDeleted;

    @Column(
            nullable = false,
            length = 50
    )
    private String name;

    @OneToMany(mappedBy = "course")
    private List<Course> course;
}
