package com.icanerdogan.HRMS.dataAccess.abstracts.CV;

import com.icanerdogan.HRMS.entities.concretes.CV.CVCoverLetter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CVCoverLetterDao extends JpaRepository<CVCoverLetter, Integer> {
    CVCoverLetter getCVCoverLetterByCandidate_Id(int id);
}
