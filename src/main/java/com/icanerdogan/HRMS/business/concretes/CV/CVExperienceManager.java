package com.icanerdogan.HRMS.business.concretes.CV;

import com.icanerdogan.HRMS.business.abstracts.CV.CVExperienceService;
import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.core.utilities.results.SuccessDataResult;
import com.icanerdogan.HRMS.core.utilities.results.SuccessResult;
import com.icanerdogan.HRMS.dataAccess.abstracts.CV.CVExperienceDao;
import com.icanerdogan.HRMS.entities.concretes.CV.CVExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CVExperienceManager implements CVExperienceService {
    private CVExperienceDao cvExperienceDao;

    @Autowired
    public CVExperienceManager(CVExperienceDao cvExperienceDao) {
        this.cvExperienceDao = cvExperienceDao;
    }

    @Override
    public Result add(CVExperience cvExperience) {
        this.cvExperienceDao.save(cvExperience);
        return new SuccessResult("Tecrübe Başarıyla Eklendi!");
    }

    @Override
    public Result update(CVExperience cvExperience) {
        this.cvExperienceDao.save(cvExperience);
        return new SuccessResult("Tecrübe Başarıyla Güncellendi!");
    }

    @Override
    public Result delete(int id) {
        this.cvExperienceDao.deleteById(id);
        return new SuccessResult("Tecrübe Başarıyla Silindi!");
    }

    @Override
    public DataResult<List<CVExperience>> getAll() {
        return new SuccessDataResult<List<CVExperience>>(this.cvExperienceDao.findAll());
    }

    @Override
    public DataResult<List<CVExperience>> getAllByCandidateId(int id) {
        return new SuccessDataResult<List<CVExperience>>(this.cvExperienceDao.getAllByCandidate_Id(id));

    }

    @Override
    public DataResult<List<CVExperience>> getAllByCandidateIdOrderByLeaveDateDesc(int id) {
        return new SuccessDataResult<List<CVExperience>>(this.cvExperienceDao.getAllByCandidate_IdOrderByLeaveDateDesc(id));

    }
}
