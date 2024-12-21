package ir.publications.task.model;

import ir.publications.task.model.baseModel.Base;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "STUDENT")
public class Student extends Person {

    private Double score;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "major_id")
    private Major major;

    @ManyToMany
    @JoinTable(
            name = "Student_CourseRegistration",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "CourseRegistration_id")
    )
    private Set<CourseRegistration> courseRegistrations;

    @ManyToMany
    @JoinTable(
            name = "Student_Semester",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "Semester_id")
    )
    private Set<Semester> semesters;

}
