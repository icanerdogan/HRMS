package com.icanerdogan.HRMS.business.concretes.CV;

import com.icanerdogan.HRMS.business.abstracts.CV.CVLanguageService;
import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.core.utilities.results.SuccessDataResult;
import com.icanerdogan.HRMS.core.utilities.results.SuccessResult;
import com.icanerdogan.HRMS.dataAccess.abstracts.CV.CVLanguageDao;
import com.icanerdogan.HRMS.entities.concretes.CV.CVLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CVLanguageManager implements CVLanguageService {
    private CVLanguageDao cvLanguageDao;

    @Autowired
    public CVLanguageManager(CVLanguageDao cvLanguageDao) {
        this.cvLanguageDao = cvLanguageDao;
    }

    @Override
    public Result add(CVLanguage cvLanguage) {
        this.cvLanguageDao.save(cvLanguage);
        return new SuccessResult("Dil Başarıyla Eklendi!");
    }

    @Override
    public Result update(CVLanguage cvLanguage) {
        this.cvLanguageDao.save(cvLanguage);
        return new SuccessResult("Dil Başarıyla Güncellendi!");
    }

    @Override
    public Result delete(int id) {
        this.cvLanguageDao.deleteById(id);
        return new SuccessResult("Dil Başarıyla Silindi!");
    }

    @Override
    public DataResult<List<CVLanguage>> getAll() {
        return new SuccessDataResult<List<CVLanguage>>(this.cvLanguageDao.findAll());
    }

    @Override
    public DataResult<List<CVLanguage>> getAllByCandidateId(int id) {
        return new SuccessDataResult<List<CVLanguage>>(this.cvLanguageDao.getAllByCandidate_Id(id));
    }
}
