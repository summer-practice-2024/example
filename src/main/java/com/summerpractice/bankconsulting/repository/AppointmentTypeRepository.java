package com.summerpractice.bankconsulting.repository;

import com.summerpractice.bankconsulting.model.AppointmentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface AppointmentTypeRepository extends JpaRepository<AppointmentType, Integer> {

}
