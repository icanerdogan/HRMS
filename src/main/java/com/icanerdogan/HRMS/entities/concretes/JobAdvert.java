package com.icanerdogan.HRMS.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "job_advertisements")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    // İş Veren
    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;


    @Column(name = "job_description")
    private String job_description;

    @Column(name = "min_salary")
    private String min_salary;

    @Column(name = "max_salary")
    private String max_salary;

    @Column(name = "number_of_positions")
    private String number_of_positions;

    @Column(name = "creation_date")
    private LocalDateTime creation_date = LocalDateTime.now();

    @Column(name = "application_deadline")
    private LocalDate application_deadline;

    @Column(name = "active")
    private boolean active_status;

}
