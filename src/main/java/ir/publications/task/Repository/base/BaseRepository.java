package ir.publications.task.Repository.base;

import ir.publications.task.model.baseModel.BaseInformation;

import java.util.List;

public interface BaseRepository<T,ID> {
    T saveAndUpdate(T t);
    Boolean deleteById(ID id);
    List<T> findAll();
    T findById(ID id);
}
