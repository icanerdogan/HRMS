package com.icanerdogan.HRMS.dataAccess.abstracts;

import com.icanerdogan.HRMS.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
    User findByEmailAdress(String email);
}
