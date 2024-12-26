package ir.publications.task.Repository.impl;

import ir.publications.task.Repository.ClassRoomRepository;
import ir.publications.task.Repository.base.impl.BaseRepositoryImpl;
import ir.publications.task.model.ClassRoom;
import org.springframework.stereotype.Repository;

@Repository
public class ClassRoomRepositoryImpl extends BaseRepositoryImpl<ClassRoom,Long> implements ClassRoomRepository {
    @Override
    public Class<ClassRoom> getEntityClass() {
        return ClassRoom.class;
    }
}
