package ir.publications.task.Repository;

import ir.publications.task.Repository.base.BaseRepository;
import ir.publications.task.model.University;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends BaseRepository<University,Long> {
}
