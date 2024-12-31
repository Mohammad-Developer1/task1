package ir.publications.task.web.viewModel;

import ir.publications.task.web.viewModel.base.BaseEntityViewModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
public class SemesterViewModel extends BaseEntityViewModel<Long> {

    private String name;

    private String startDate;

    private String endTimeDate;

    private Set<CourseViewModel> courses;

    private Set<TeacherViewModel> teachers;
}
