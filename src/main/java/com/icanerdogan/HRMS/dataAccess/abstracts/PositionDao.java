package com.icanerdogan.HRMS.dataAccess.abstracts;

import com.icanerdogan.HRMS.entities.concretes.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionDao extends JpaRepository<Position, Integer> {
}
