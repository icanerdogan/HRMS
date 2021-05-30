package com.icanerdogan.HRMS.dataAccess.abstracts;

import com.icanerdogan.HRMS.entities.concretes.User;
import com.icanerdogan.HRMS.entities.concretes.UserVerification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserVerificationDao extends JpaRepository<UserVerification, Integer> {

}
