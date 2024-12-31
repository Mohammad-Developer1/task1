package ir.publications.task.model;

import ir.publications.task.model.baseModel.Base;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Semester")
public class Semester extends Base<Long> {

    private String name;

    private LocalDate startDate;

    private LocalDate endTimeDate;

    @OneToMany
    @JoinTable(name = "semeter_course")
    private Set<Course> courses ;

    @OneToMany
    @JoinTable(name = "semester_teacher")
    private Set<Teacher> teachers;


}
