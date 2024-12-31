package ir.publications.task.web.viewModel;

import ir.publications.task.web.viewModel.base.BaseEntityViewModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
public class CourseViewModel extends BaseEntityViewModel<Long> {


    private String Title;

    private Long unit;

    private Set<DepartmentViewModel> Departments;

    private Set<MajorViewModel> majors;

    private Set<CourseViewModel> prerequisites;

    private Set<ClassRoomViewModel> classrooms;
}
