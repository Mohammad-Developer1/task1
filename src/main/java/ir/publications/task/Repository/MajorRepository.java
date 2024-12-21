package ir.publications.task.Repository;

import ir.publications.task.Repository.base.BaseRepository;
import ir.publications.task.model.Major;
import org.springframework.stereotype.Repository;

@Repository
public interface MajorRepository extends BaseRepository<Major,Long> {
}
