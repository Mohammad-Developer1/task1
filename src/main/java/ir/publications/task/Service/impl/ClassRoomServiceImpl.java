package ir.publications.task.Service.impl;

import ir.publications.task.Repository.ClassRoomRepository;
import ir.publications.task.Service.ClassRoomService;
import ir.publications.task.model.ClassRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomServiceImpl implements ClassRoomService {

    @Autowired
    private ClassRoomRepository cr;

    public ClassRoomServiceImpl(ClassRoomRepository cr) {
        this.cr = cr;
    }


    @Override
    public ClassRoom saveAndUpdateClassRoom(ClassRoom classRoom) {
        if (classRoom == null){
            throw new NullPointerException("classRoom is null");
        }else {
          return cr.saveAndUpdate(classRoom);
        }
    }

    @Override
    public Boolean deleteClassRoom(Long id) {
        if (id == null){
            throw new NullPointerException("id is null");
        }else {
            cr.deleteById(id);
        }
        return null;
    }

    @Override
    public List<ClassRoom> getAllClassRooms() {
        return cr.findAll();
    }
}
