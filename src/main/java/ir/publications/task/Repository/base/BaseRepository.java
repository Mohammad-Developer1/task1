package ir.publications.task.Repository.base;

import ir.publications.task.model.baseModel.BaseInformation;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.List;
@NoRepositoryBean
public interface BaseRepository<T,ID> {
    T saveAndUpdate(T t);
    Boolean deleteById(ID id);
    List<T> findAll();
    T findById(ID id);
}
