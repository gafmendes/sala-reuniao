package com.gfmendes.crud.saladereuniao.salareuniao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gfmendes.crud.saladereuniao.salareuniao.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{

}
