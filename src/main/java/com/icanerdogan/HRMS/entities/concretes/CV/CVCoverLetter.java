package com.icanerdogan.HRMS.entities.concretes.CV;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.icanerdogan.HRMS.entities.concretes.Candidate;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cv_coverletter")

public class CVCoverLetter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    @NotNull
    @JsonIgnore
    private Candidate candidate;

    @Column(name = "cover_letter")
    @Lob // Uzun metinler için
    private String coverLetter;
}
