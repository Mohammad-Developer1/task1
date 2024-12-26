package ir.publications.task.model.baseModel;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Component
public class BaseInformation extends Base {

    @OneToOne
    private BaseInformation masterId;

    @ManyToOne
    private BaseInformationHed parentId;

    private String title;

    private Integer code;
}
