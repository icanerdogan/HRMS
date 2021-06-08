package com.icanerdogan.HRMS.business.concretes.CV;

import com.icanerdogan.HRMS.business.abstracts.CV.CVCoverLetterService;
import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.core.utilities.results.SuccessDataResult;
import com.icanerdogan.HRMS.core.utilities.results.SuccessResult;
import com.icanerdogan.HRMS.dataAccess.abstracts.CV.CVCoverLetterDao;
import com.icanerdogan.HRMS.entities.concretes.CV.CVCoverLetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CVCoverLetterManager implements CVCoverLetterService {
    private CVCoverLetterDao cvCoverLetterDao;

    @Autowired
    public CVCoverLetterManager(CVCoverLetterDao cvCoverLetterDao) {
        this.cvCoverLetterDao = cvCoverLetterDao;
    }

    @Override
    public Result add(CVCoverLetter cvCoverLetter) {
        this.cvCoverLetterDao.save(cvCoverLetter);
        return new SuccessResult("Ön Yazı Başarıyla Eklendi!");
    }

    @Override
    public Result update(CVCoverLetter cvCoverLetter) {
        this.cvCoverLetterDao.save(cvCoverLetter);
        return new SuccessResult("Ön Yazı Başarıyla Güncellendi!");
    }

    @Override
    public Result delete(int id) {
        this.cvCoverLetterDao.deleteById(id);
        return new SuccessResult("Ön Yazı Başarıyla Silindi!");
    }

    @Override
    public DataResult<List<CVCoverLetter>> getAll() {
        return new SuccessDataResult<List<CVCoverLetter>>(this.cvCoverLetterDao.findAll());
    }

    @Override
    public DataResult<List<CVCoverLetter>> getAllByCandidateId(int id) {
        return new SuccessDataResult(this.cvCoverLetterDao.getCVCoverLetterByCandidate_Id(id));
    }
}
