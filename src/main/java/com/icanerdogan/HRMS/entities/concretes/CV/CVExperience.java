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
@Table(name = "cv_experiencesc")

public class CVExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    @NotNull
    @JsonIgnore
    private Candidate candidate;

    @Column(name = "company_name")
    @NotNull
    private String companyName;

    @Column(name = "position")
    @NotNull
    private String position;

    @Column(name = "start_date")
    @NotNull
    private LocalDate startDate;

    @Column(name = "leave_date")
    private LocalDate leaveDate;

    @Column(name = "reason_leaving")
    private String reasonLeaving;

}
