package ir.publications.task.web.viewModel;

import ir.publications.task.web.viewModel.base.BaseEntityViewModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ClassRoomViewModel extends BaseEntityViewModel<Long> {

    private Long teacherId;

    private String teacherFirstName;

    private String teacherLastName;

    private Long universityId;

    private String universityName;

    private Long scheduleId;

    private Long semesterId;

    private String semesterName;

}
