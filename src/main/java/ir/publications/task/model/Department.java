package ir.publications.task.model;

import ir.publications.task.model.baseModel.Base;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Department")
public class Department extends Base {
    @Column
    private String name;

    @ManyToOne
    private Course course;
}
