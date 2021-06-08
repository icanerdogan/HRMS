package com.icanerdogan.HRMS.entities.concretes.CV;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.icanerdogan.HRMS.entities.concretes.Candidate;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cv_educations")
public class CVEducation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    @NotNull
    @JsonIgnore
    private Candidate candidate;

    @Column(name = "school_name")
    @NotNull
    private String schoolName;

    @Column(name = "department_name")
    @NotNull
    private String departmentName;

    @Column(name = "graduation_year")
    @NotNull
    private String graduationYear;

    @Column(name = "start_year")
    @NotNull
    private String startYear;

    @Column(name = "starting_date")
    @NotNull
    private LocalDate startingDate;

    @Column(name = "ending_date")
    private LocalDate endingDate;
}
