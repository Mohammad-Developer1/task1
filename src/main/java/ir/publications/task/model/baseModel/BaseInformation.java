package ir.publications.task.model.baseModel;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseInformation extends Base<Long> {

    @OneToOne
    private BaseInformation masterId;

    @ManyToOne
    private BaseInformationHed parentId;

    private String title;

    private Long code;
}
