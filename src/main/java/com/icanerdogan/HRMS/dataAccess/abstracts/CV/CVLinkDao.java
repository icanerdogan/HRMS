package com.icanerdogan.HRMS.dataAccess.abstracts.CV;

import com.icanerdogan.HRMS.entities.concretes.CV.CVLink;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CVLinkDao extends JpaRepository<CVLink, Integer> {
    List<CVLink> getAllByCandidate_Id(int id);
}
