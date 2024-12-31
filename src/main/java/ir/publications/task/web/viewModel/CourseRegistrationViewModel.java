package ir.publications.task.web.viewModel;

import ir.publications.task.web.viewModel.base.BaseEntityViewModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CourseRegistrationViewModel extends BaseEntityViewModel<Long> {

    private Long year;

    private Long courseId;

    private String courseTitle;

    private Long semesterId;

    private String semesterName;

    private Long classRoomId;



}
