package ir.publications.task.Repository.impl;

import ir.publications.task.Repository.CourseRegistrationRepository;
import ir.publications.task.Repository.base.impl.BaseRepositoryImpl;
import ir.publications.task.model.CourseRegistration;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRegistrationRepositoryImpl extends BaseRepositoryImpl<CourseRegistration,Long> implements CourseRegistrationRepository {
    @Override
    public Class<CourseRegistration> getEntityClass() {
        return CourseRegistration.class;
    }
}
