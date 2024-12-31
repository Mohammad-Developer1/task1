package ir.publications.task.web.controller;

import ir.publications.task.Service.ScheduleService;
import ir.publications.task.model.Schedule;
import ir.publications.task.util.mapper.ModelMapper;
import ir.publications.task.web.viewModel.ScheduleViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;


    @PostMapping("/saveAndUpdateSchedule")
    @ResponseBody
    public Schedule saveAndUpdateSchedule(@RequestBody ScheduleViewModel scheduleViewModel) {
        return scheduleService.saveAndUpdateSchedule(ModelMapper.map(scheduleViewModel, Schedule.class));

    }

    @DeleteMapping("/deleteSchedule/{id}")
    @ResponseBody
    public Boolean deleteSchedule(@PathVariable Long id) {
        return scheduleService.deleteSchedule(id);
    }

    @GetMapping("/getSchedule")
    @ResponseBody
    public List<ScheduleViewModel> getSchedule() {
        return ModelMapper.mapList(scheduleService.getSchedules(), ScheduleViewModel.class);
    }
}
