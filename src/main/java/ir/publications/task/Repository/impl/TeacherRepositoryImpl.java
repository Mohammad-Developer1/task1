package ir.publications.task.Repository.impl;

import ir.publications.task.Repository.TeacherRepository;
import ir.publications.task.Repository.base.impl.BaseRepositoryImpl;
import ir.publications.task.model.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherRepositoryImpl extends BaseRepositoryImpl<Teacher,Long> implements TeacherRepository {
    @Override
    public Class<Teacher> getEntityClass() {
        return Teacher.class;
    }
}
