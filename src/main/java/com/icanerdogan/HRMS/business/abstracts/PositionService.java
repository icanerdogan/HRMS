package com.icanerdogan.HRMS.business.abstracts;

import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.Position;

import java.util.List;

public interface PositionService {
    List<Position> getAll();
    Result addPosition(Position position);
}

