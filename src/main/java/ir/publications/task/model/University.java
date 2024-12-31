package ir.publications.task.model;

import ir.publications.task.model.baseModel.Base;
import ir.publications.task.model.baseModel.BaseInformation;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "University")
public class University extends Base<Long> {
    private String name;
    private String address;

    @ManyToOne
    private BaseInformation baseInformation;
}
