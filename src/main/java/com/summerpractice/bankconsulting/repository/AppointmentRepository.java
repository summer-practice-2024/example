package com.summerpractice.bankconsulting.repository;

import com.summerpractice.bankconsulting.model.Appointment;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {

}
