package com.userfront.userfront.dao;

import java.util.List;

import com.userfront.userfront.domain.Appointment;
import org.springframework.data.repository.CrudRepository;



public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();

 //   Appointment findOne(Long id);
}
