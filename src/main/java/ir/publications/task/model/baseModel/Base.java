package ir.publications.task.model.baseModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class Base<T> implements Serializable {

    @Id
    @GeneratedValue
    private T id;

    @Column
    private String createdBy;

    @Column
    private String createdDate;

    @Column
    private String updatedBy;

    @Column
    private String updatedDate;

    @Column
    private String ip;

}
