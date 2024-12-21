package ir.publications.task.controller;


import ir.publications.task.Service.ClassRoomService;
import ir.publications.task.model.ClassRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/classRoom")
public class ClassRoomController {

    @Autowired
    private ClassRoomService cs;


    @PostMapping("/save_and_update_ClassRoom")
    public ResponseEntity<ClassRoom> saveAndUpdateClassRoom(@RequestBody ClassRoom classRoom) {
        cs.saveAndUpdateClassRoom(classRoom);
        return ResponseEntity.ok(classRoom);
    }

    @PostMapping("/delete_classRoom")
    public Boolean deleteClassRoom(Long id) {
        return cs.deleteClassRoom(id);
    }

    @GetMapping("/get_classRoom")
    public ResponseEntity<List<ClassRoom>> getClassRoom() {
        List<ClassRoom> all = cs.getAllClassRooms();
        return ResponseEntity.ok(all);
    }
}
