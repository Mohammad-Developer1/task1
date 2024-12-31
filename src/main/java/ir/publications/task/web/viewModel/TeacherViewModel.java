package ir.publications.task.web.viewModel;

import ir.publications.task.web.viewModel.base.BaseEntityViewModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
public class TeacherViewModel extends PersonViewModel {


    private Set<UniversityViewModel> universities;

    private Set<CourseViewModel> courses;

}
