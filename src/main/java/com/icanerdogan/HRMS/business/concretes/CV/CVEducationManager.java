package com.icanerdogan.HRMS.business.concretes.CV;

import com.icanerdogan.HRMS.business.abstracts.CV.CVEducationService;
import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.core.utilities.results.SuccessDataResult;
import com.icanerdogan.HRMS.core.utilities.results.SuccessResult;
import com.icanerdogan.HRMS.dataAccess.abstracts.CV.CVEducationDao;
import com.icanerdogan.HRMS.entities.concretes.CV.CVEducation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CVEducationManager implements CVEducationService {
    private CVEducationDao cvEducationDao;

    @Autowired
    public CVEducationManager(CVEducationDao cvEducationDao) {
        this.cvEducationDao = cvEducationDao;
    }

    @Override
    public Result add(CVEducation cvEducation) {
        this.cvEducationDao.save(cvEducation);
        return new SuccessResult("Okul Başarıyla Eklendi!");
    }

    @Override
    public Result update(CVEducation cvEducation) {
        this.cvEducationDao.save(cvEducation);
        return new SuccessResult("Okul Başarıyla Güncellendi!");
    }

    @Override
    public Result delete(int id) {
        this.cvEducationDao.deleteById(id);
        return new SuccessResult("Okul Başarıyla Silindi!");
    }

    @Override
    public DataResult<List<CVEducation>> getAll() {
        return new SuccessDataResult<List<CVEducation>>(this.cvEducationDao.findAll());
    }

    @Override
    public DataResult<List<CVEducation>> getAllByCandidateId(int id) {
        return new SuccessDataResult<List<CVEducation>>(this.cvEducationDao.getAllByCandidate_Id(id));
    }

    @Override
    public DataResult<List<CVEducation>> getAllByCandidateIdOrderByGraduationYearDesc(int id) {
        return new SuccessDataResult<List<CVEducation>>(this.cvEducationDao.getAllByCandidate_IdOrderByGraduationYearDesc(id));
    }
}
