package ir.publications.task.web.viewModel;

import ir.publications.task.web.viewModel.base.BaseEntityViewModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BaseInformationViewModel extends BaseEntityViewModel<Long> {

    private Long masterId;

    private Long parentId;

    private String BaseInformationHedTitle;

    private String title;

    private Long code;




}
