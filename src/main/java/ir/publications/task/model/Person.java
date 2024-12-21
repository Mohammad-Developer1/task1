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
public abstract class Person extends Base {

    @Column(name = "first_name"  , length = 50)
    private String firstName;

    @Column(name = "last_name" , length = 50)
    private String lastName;

    @Column(nullable = false , length = 50)
    private String nationality;

    @Column(name = "national_code" , length = 10)
    private String nationalCode;

    private String email;

    @Column(name = "phone_number" , length = 11)
    private String phoneNumber;

    @Transient
    private Integer age;

    @Column
    private String Address;
}
