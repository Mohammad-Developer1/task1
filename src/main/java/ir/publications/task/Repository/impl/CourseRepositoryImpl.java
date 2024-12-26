package ir.publications.task.Repository.impl;

import ir.publications.task.Repository.CourseRepository;
import ir.publications.task.Repository.base.impl.BaseRepositoryImpl;
import ir.publications.task.model.Course;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepositoryImpl extends BaseRepositoryImpl<Course,Long> implements CourseRepository {
    @Override
    public Class<Course> getEntityClass() {
        return Course.class;
    }
}
