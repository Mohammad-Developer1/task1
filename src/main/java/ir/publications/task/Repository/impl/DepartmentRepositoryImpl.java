package ir.publications.task.Repository.impl;

import ir.publications.task.Repository.DepartmentRepository;
import ir.publications.task.Repository.base.impl.BaseRepositoryImpl;
import ir.publications.task.model.Department;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentRepositoryImpl extends BaseRepositoryImpl<Department,Long> implements DepartmentRepository {
    @Override
    public Class<Department> getEntityClass() {
        return Department.class;
    }
}
