package ir.publications.task.Repository;

import ir.publications.task.Repository.base.BaseRepository;
import ir.publications.task.model.Semester;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterRepository extends BaseRepository<Semester, Long> {
}
