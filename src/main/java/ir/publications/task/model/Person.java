package ir.publications.task.model;

import ir.publications.task.model.baseModel.Base;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person extends Base<Long> {

    @Column(   length = 50)
    private String firstName;

    @Column(  length = 50)
    private String lastName;

    @Column( length = 50)
    private String nationality;

    @Column( length = 10)
    private String nationalCode;

    private String email;

    @Column( length = 11)
    private String phoneNumber;

    @Transient
    private Integer age;

    @Column
    private String Address;
}
