package ir.publications.task.Repository;

import ir.publications.task.Repository.base.BaseRepository;
import ir.publications.task.model.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends BaseRepository<Teacher,Long> {
}
