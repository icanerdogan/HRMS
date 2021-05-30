package com.icanerdogan.HRMS.business.concretes;

import com.icanerdogan.HRMS.business.abstracts.PositionService;
import com.icanerdogan.HRMS.core.utilities.results.ErrorResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.core.utilities.results.SuccessResult;
import com.icanerdogan.HRMS.dataAccess.abstracts.PositionDao;
import com.icanerdogan.HRMS.entities.concretes.Position;
import com.icanerdogan.HRMS.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionManager implements PositionService {
    private PositionDao positionDao;

    @Autowired
    public PositionManager(PositionDao positionDao) {
        this.positionDao = positionDao;
    }

    @Override
    public List<Position> getAll() {
        return this.positionDao.findAll();
    }

    @Override
    public Result addPosition(Position position) {
        for (Position p : this.positionDao.findAll()){
            if (p.getPositionName().equals(position.getPositionName())){
                return new ErrorResult("Bu Pozisyon Zaten Mevcut! Başka bir pozisyon Eklemeyi Deneyin!");
            }
        }
        return new SuccessResult("Pozisyon Başarıyla Eklendi: "+position.getPositionName());
    }

}
