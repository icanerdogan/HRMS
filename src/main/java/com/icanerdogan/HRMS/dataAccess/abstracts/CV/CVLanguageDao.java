package com.icanerdogan.HRMS.dataAccess.abstracts.CV;

import com.icanerdogan.HRMS.entities.concretes.CV.CVLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CVLanguageDao extends JpaRepository<CVLanguage, Integer> {
    List<CVLanguage> getAllByCandidate_Id(int id);
}
