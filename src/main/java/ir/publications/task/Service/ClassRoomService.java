package ir.publications.task.Service;

import ir.publications.task.model.ClassRoom;

import java.util.List;

public interface ClassRoomService {
    ClassRoom saveAndUpdateClassRoom(ClassRoom classRoom);

    Boolean deleteClassRoom(Long id);

    List<ClassRoom> getAllClassRooms();
}
