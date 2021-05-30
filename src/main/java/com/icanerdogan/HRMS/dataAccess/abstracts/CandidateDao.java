package com.icanerdogan.HRMS.dataAccess.abstracts;

import com.icanerdogan.HRMS.entities.concretes.Candidate;
import com.icanerdogan.HRMS.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {
    Candidate findByIdentificationnumber(String identificationNumber);
}

