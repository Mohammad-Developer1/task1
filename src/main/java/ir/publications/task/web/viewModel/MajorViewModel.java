package ir.publications.task.web.viewModel;

import ir.publications.task.web.viewModel.base.BaseEntityViewModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class MajorViewModel extends BaseEntityViewModel<Long> {


    private String majorName;
}
