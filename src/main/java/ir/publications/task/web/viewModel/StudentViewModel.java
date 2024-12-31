package ir.publications.task.web.viewModel;

import ir.publications.task.web.viewModel.base.BaseEntityViewModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
public class StudentViewModel extends PersonViewModel {


    private Double score;

    private Long departmentId;

    private String departmentName;

    private Long majorId;

    private String majorName;

    private Set<CourseRegistrationViewModel> courseRegistrations;

    private Set<SemesterViewModel> semesters;
}
