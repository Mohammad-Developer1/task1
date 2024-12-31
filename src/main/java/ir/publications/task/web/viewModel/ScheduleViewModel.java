package ir.publications.task.web.viewModel;

import ir.publications.task.model.enums.Week;
import ir.publications.task.web.viewModel.base.BaseEntityViewModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalTime;

@EqualsAndHashCode(callSuper = true)
@Data
public class ScheduleViewModel extends BaseEntityViewModel<Long> {

    private Week day;

    private String startTime;

    private String endTime;
}
