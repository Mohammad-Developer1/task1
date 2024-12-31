package ir.publications.task.web.viewModel;

import ir.publications.task.web.viewModel.base.BaseEntityViewModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DepartmentViewModel extends BaseEntityViewModel<Long> {


    private String name;

    private Long courseId;

    private String courseTitle;
}
