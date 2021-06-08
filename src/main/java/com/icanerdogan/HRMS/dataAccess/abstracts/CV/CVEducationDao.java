package com.icanerdogan.HRMS.dataAccess.abstracts.CV;

import com.icanerdogan.HRMS.entities.concretes.CV.CVEducation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CVEducationDao extends JpaRepository<CVEducation, Integer> {
    List<CVEducation> getAllByCandidate_Id(int id);
    List<CVEducation> getAllByCandidate_IdOrderByGraduationYearDesc(int id);
}
