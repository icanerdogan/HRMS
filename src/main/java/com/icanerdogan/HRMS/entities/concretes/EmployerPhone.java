package com.icanerdogan.HRMS.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "employer_phones")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployerPhone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "employer_id")
    private int employerId;
    @Column(name = "phone_number")
    private String phoneNumber;
}
