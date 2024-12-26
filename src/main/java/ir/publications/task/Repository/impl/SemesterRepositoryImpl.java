package ir.publications.task.Repository.impl;

import ir.publications.task.Repository.SemesterRepository;
import ir.publications.task.Repository.base.impl.BaseRepositoryImpl;
import ir.publications.task.model.Semester;
import org.springframework.stereotype.Repository;

@Repository
public class SemesterRepositoryImpl extends BaseRepositoryImpl<Semester,Long> implements SemesterRepository {
    @Override
    public Class<Semester> getEntityClass() {
        return Semester.class;
    }
}
