package ir.publications.task.Repository.impl;

import ir.publications.task.Repository.ScheduleRepository;
import ir.publications.task.Repository.base.impl.BaseRepositoryImpl;
import ir.publications.task.model.Schedule;
import org.springframework.stereotype.Repository;

@Repository
public class ScheduleRepositoryImpl extends BaseRepositoryImpl<Schedule,Long> implements ScheduleRepository {
    @Override
    public Class<Schedule> getEntityClass() {
        return Schedule.class;
    }
}
