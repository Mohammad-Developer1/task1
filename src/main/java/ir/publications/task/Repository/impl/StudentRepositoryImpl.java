package ir.publications.task.Repository.impl;

import ir.publications.task.Repository.StudentRepository;
import ir.publications.task.Repository.base.impl.BaseRepositoryImpl;
import ir.publications.task.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepositoryImpl extends BaseRepositoryImpl<Student,Long> implements StudentRepository {
    @Override
    public Class<Student> getEntityClass() {
        return Student.class;
    }
}
