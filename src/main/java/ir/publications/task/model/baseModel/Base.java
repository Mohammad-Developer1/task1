package ir.publications.task.model.baseModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Base implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String createdBy;

    @Column(nullable = false)
    private LocalDate createdDate;

    @Column
    private String updatedBy;

    @Column
    private LocalDate updatedDate;

    @Column
    private String ip;

}
