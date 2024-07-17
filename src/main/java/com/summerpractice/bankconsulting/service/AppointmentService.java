package com.summerpractice.bankconsulting.service;

import com.summerpractice.bankconsulting.model.Appointment;
import com.summerpractice.bankconsulting.model.AppointmentType;
import com.summerpractice.bankconsulting.repository.AppointmentRepository;
import com.summerpractice.bankconsulting.repository.AppointmentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentTypeRepository appointmentTypeRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<AppointmentType> getAllAppointmentTypes() {
        return appointmentTypeRepository.findAll();
    }

    public void saveAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
    }
}
