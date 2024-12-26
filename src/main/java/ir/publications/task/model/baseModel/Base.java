package ir.publications.task.model.baseModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Base implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String createdBy;

    @Column
    private LocalDate createdDate;

    @Column
    private String updatedBy;

    @Column
    private LocalDate updatedDate;

    @Column
    private String ip;

}
