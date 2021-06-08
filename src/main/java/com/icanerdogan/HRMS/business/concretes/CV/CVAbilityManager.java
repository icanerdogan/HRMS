package com.icanerdogan.HRMS.business.concretes.CV;

import com.icanerdogan.HRMS.business.abstracts.CV.CVAbilityService;
import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.core.utilities.results.SuccessDataResult;
import com.icanerdogan.HRMS.core.utilities.results.SuccessResult;
import com.icanerdogan.HRMS.dataAccess.abstracts.CV.CVAbilityDao;
import com.icanerdogan.HRMS.entities.concretes.CV.CVAbility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CVAbilityManager implements CVAbilityService {
    private CVAbilityDao cvAbilityDao;

    @Autowired
    public CVAbilityManager(CVAbilityDao cvAbilityDao) {
        this.cvAbilityDao = cvAbilityDao;
    }


    @Override
    public Result add(CVAbility cvAbility) {
        this.cvAbilityDao.save(cvAbility);
        return new SuccessResult("Yeni Yetenek Eklendi!");
    }

    @Override
    public Result delete(int id) {
        this.cvAbilityDao.deleteById(id);
        return new SuccessResult("Yetenek Silindi!");
    }

    @Override
    public Result update(CVAbility cvAbility) {
        this.cvAbilityDao.save(cvAbility);
        return new SuccessResult("Yetenek Güncellendi!");
    }

    @Override
    public DataResult<List<CVAbility>> getAll() {
        return new SuccessDataResult<List<CVAbility>>(this.cvAbilityDao.findAll());
    }

    @Override
    public DataResult<List<CVAbility>> getAllByCandidateId(int id) {
        return new SuccessDataResult<List<CVAbility>>(this.cvAbilityDao.getAllByCandidate_Id(id));
    }
}
