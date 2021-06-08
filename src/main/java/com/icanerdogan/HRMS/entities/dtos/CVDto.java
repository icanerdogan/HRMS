package com.icanerdogan.HRMS.entities.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.icanerdogan.HRMS.entities.concretes.CV.*;
import com.icanerdogan.HRMS.entities.concretes.Candidate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CVDto {

    @JsonIgnore
    public Candidate candidate;

    private List<CVEducation> cvEducations;
    private List<CVExperience> cvExperiences;
    private List<CVLanguage> cvLanguages;
    private List<CVPhotograph> cvPhotographs;
    private List<CVLink> cvLinks;
    private List<CVAbility> cvAbilities;
    private List<CVCoverLetter> cvCoverLetters;


}
