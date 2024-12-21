package ir.publications.task.Service.impl;

import ir.publications.task.Repository.ScheduleRepository;
import ir.publications.task.Service.ScheduleService;
import ir.publications.task.model.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleRepository sr;

    public ScheduleServiceImpl(ScheduleRepository sr) {
        this.sr = sr;
    }


    @Override
    public Schedule saveAndUpdateSchedule(Schedule schedule) {
        if (schedule == null) {
            throw new NullPointerException("schedule is null");
        } else {
            return sr.saveAndUpdate(schedule);
        }
    }

    @Override
    public Boolean deleteSchedule(Long id) {
        if (id == null) {
            throw new NullPointerException("schedule is null");
        } else {
            sr.deleteById(id);
        }
        return null;
    }

    @Override
    public List<Schedule> getSchedules() {
        return sr.findAll();
    }
}
