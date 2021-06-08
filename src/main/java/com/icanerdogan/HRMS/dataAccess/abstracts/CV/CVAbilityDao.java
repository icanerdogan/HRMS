package com.icanerdogan.HRMS.dataAccess.abstracts.CV;

import com.icanerdogan.HRMS.entities.concretes.CV.CVAbility;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CVAbilityDao extends JpaRepository<CVAbility, Integer> {
    List<CVAbility> getAllByCandidate_Id(int id);
}
