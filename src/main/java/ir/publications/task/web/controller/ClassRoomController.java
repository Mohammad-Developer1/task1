package ir.publications.task.web.controller;


import ir.publications.task.Service.ClassRoomService;
import ir.publications.task.model.ClassRoom;
import ir.publications.task.util.mapper.ModelMapper;
import ir.publications.task.web.viewModel.ClassRoomViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/classRoom")
public class ClassRoomController {

    @Autowired
    private ClassRoomService cs;


    @PostMapping("/save")
    @ResponseBody
    public ClassRoom save(@RequestBody ClassRoomViewModel classRoomViewModel) {
        return cs.saveAndUpdateClassRoom(ModelMapper.map(classRoomViewModel,ClassRoom.class));
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public Boolean deleteClassRoom(@PathVariable Long id) {
        return cs.deleteClassRoom(id);
    }

    @GetMapping("/get_classRoom")
    @ResponseBody
    public List<ClassRoomViewModel> getClassRoom() {
        return ModelMapper.mapList(cs.getAllClassRooms(), ClassRoomViewModel.class);
    }
}
