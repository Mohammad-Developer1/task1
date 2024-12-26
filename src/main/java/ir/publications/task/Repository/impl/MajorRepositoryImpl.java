package ir.publications.task.Repository.impl;

import ir.publications.task.Repository.MajorRepository;
import ir.publications.task.Repository.base.impl.BaseRepositoryImpl;
import ir.publications.task.model.Major;
import org.springframework.stereotype.Repository;

@Repository
public class MajorRepositoryImpl extends BaseRepositoryImpl<Major,Long> implements MajorRepository {
    @Override
    public Class<Major> getEntityClass() {
        return Major.class;
    }
}
