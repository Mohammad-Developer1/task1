package ir.publications.task.web.viewModel;

import ir.publications.task.web.viewModel.base.BaseEntityViewModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class UniversityViewModel extends BaseEntityViewModel<Long> {

    private String name;

    private String address;

    private Long baseInformationId;

    private String baseInformationTitle;
}
