package ir.publications.task.Repository.impl;

import ir.publications.task.Repository.UniversityRepository;
import ir.publications.task.Repository.base.impl.BaseRepositoryImpl;
import ir.publications.task.model.University;
import org.springframework.stereotype.Repository;

@Repository
public class UniversityRepositoryImpl extends BaseRepositoryImpl<University,Long> implements UniversityRepository {
    @Override
    public Class<University> getEntityClass() {
        return University.class;
    }
}
