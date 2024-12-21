package ir.publications.task.model;

import ir.publications.task.model.baseModel.Base;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "COURSE")
public class Course extends Base {

    @Column
    private String title;

    @Column
    private Long unit;

    @ManyToMany
    @JoinTable(
            name = "course_Department",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "Department_id")
    )
    private Set<Department> department;

    @ManyToMany
    @JoinTable(
            name = "course_Major",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "Major_id")
    )
    private Set<Major> majors ;


    @ManyToMany
    @JoinTable(
            name = "course_prerequisite",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "prerequisite_id")
    )
    private Set<Course> prerequisites ;

    @ManyToMany
    @JoinTable(
            name = "course_classRoom",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "classRoom_id")
    )
    private Set<ClassRoom> classes ;

}
