package com.summerpractice.bankconsulting.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "APPOINTMENTTYPES")
public class AppointmentType {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "NAME")
    private String name;
}
