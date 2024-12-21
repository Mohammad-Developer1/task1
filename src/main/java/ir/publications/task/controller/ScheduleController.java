package ir.publications.task.controller;

import ir.publications.task.Service.CourseService;
import ir.publications.task.Service.ScheduleService;
import ir.publications.task.model.Course;
import ir.publications.task.model.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/scheduleService")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;


    @PostMapping("/save_and_update_schedule")
    public ResponseEntity<Schedule> saveAndUpdateSchedule(@RequestBody Schedule schedule) {
        scheduleService.saveAndUpdateSchedule(schedule);
        return ResponseEntity.ok(schedule);
    }

    @PostMapping("/delete_schedule")
    public Boolean deleteSchedule(Long id) {
        return scheduleService.deleteSchedule(id);
    }

    @GetMapping("/get_schedule")
    public ResponseEntity<List<Schedule>> getSchedule() {
        List<Schedule> all = scheduleService.getSchedules();
        return ResponseEntity.ok(all);
    }
}
