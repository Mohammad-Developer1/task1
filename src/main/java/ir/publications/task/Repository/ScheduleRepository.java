package ir.publications.task.Repository;

import ir.publications.task.Repository.base.BaseRepository;
import ir.publications.task.model.Schedule;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends BaseRepository<Schedule,Long> {
}
