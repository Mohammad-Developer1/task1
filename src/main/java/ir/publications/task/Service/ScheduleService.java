package ir.publications.task.Service;

import ir.publications.task.model.Schedule;

import java.util.List;

public interface ScheduleService {
    Schedule saveAndUpdateSchedule(Schedule schedule);

    Boolean deleteSchedule(Long id);

    List<Schedule> getSchedules();
}
