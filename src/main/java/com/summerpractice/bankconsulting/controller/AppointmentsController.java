package com.summerpractice.bankconsulting.controller;

import com.summerpractice.bankconsulting.model.Appointment;
import com.summerpractice.bankconsulting.model.AppointmentType;
import com.summerpractice.bankconsulting.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/consulting/appointments/v1.0.0")
public class AppointmentsController {
    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/appointment-types")
    public ResponseEntity<List<AppointmentType>> getAllAppointmentTypes() {
        return ResponseEntity.ok(appointmentService.getAllAppointmentTypes());
    }

    @PostMapping("/save-appointment")
    public ResponseEntity<Void> saveAppointment(@RequestBody Appointment appointment) {
        appointmentService.saveAppointment(appointment);
        return ResponseEntity.ok().build();
    }
}
