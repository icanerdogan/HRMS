package com.icanerdogan.HRMS.dataAccess.abstracts;

import com.icanerdogan.HRMS.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

}
