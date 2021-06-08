package com.icanerdogan.HRMS.dataAccess.abstracts.CV;

import com.icanerdogan.HRMS.entities.concretes.CV.CVPhotograph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CVPhotographDao extends JpaRepository<CVPhotograph, Integer> {
    CVPhotograph getById(int id);

    CVPhotograph getByCandidate_Id(int id);
}
