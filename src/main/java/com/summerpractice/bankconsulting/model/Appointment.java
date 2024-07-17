package com.summerpractice.bankconsulting.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "DATE")
    private String date;

    @OneToOne
    @JoinColumn(name = "APPOINTMENT_TYPE", nullable = false)
    private AppointmentType appointmentType;
}
