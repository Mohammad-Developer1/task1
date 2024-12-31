package ir.publications.task.web.viewModel;

import ir.publications.task.web.viewModel.base.BaseEntityViewModel;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
public class PersonViewModel extends BaseEntityViewModel<Long> {
    private String firstName;

    private String lastName;

    private String nationality;

    private String nationalCode;

    private String email;

    private String phoneNumber;

    private Integer age;

    private String Address;


}
