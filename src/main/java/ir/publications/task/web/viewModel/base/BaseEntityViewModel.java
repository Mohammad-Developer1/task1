package ir.publications.task.web.viewModel.base;

import lombok.Data;

import java.io.Serializable;


@Data
public abstract class BaseEntityViewModel<T> implements Serializable {

    private T id;


    private String createdBy;


    private String createdDate;


    private String updatedBy;


    private String updatedDate;


    private String ip;

}
