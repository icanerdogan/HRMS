package com.icanerdogan.HRMS.dataAccess.abstracts.CV;

import com.icanerdogan.HRMS.entities.concretes.CV.CVExperience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CVExperienceDao extends JpaRepository<CVExperience, Integer> {
    List<CVExperience> getAllByCandidate_Id(int id);
    List<CVExperience> getAllByCandidate_IdOrderByLeaveDateDesc(int id);
}
