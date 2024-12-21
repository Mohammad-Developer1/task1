package ir.publications.task.Repository;

import ir.publications.task.Repository.base.BaseRepository;
import ir.publications.task.model.Department;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends BaseRepository<Department,Long> {
}
