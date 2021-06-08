package com.icanerdogan.HRMS.business.concretes.CV;

import com.icanerdogan.HRMS.business.abstracts.CV.CVLinkService;
import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.core.utilities.results.SuccessDataResult;
import com.icanerdogan.HRMS.core.utilities.results.SuccessResult;
import com.icanerdogan.HRMS.dataAccess.abstracts.CV.CVLinkDao;
import com.icanerdogan.HRMS.entities.concretes.CV.CVLink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CVLinkManager implements CVLinkService {

    private CVLinkDao cvLinkDao;

    @Autowired
    public CVLinkManager(CVLinkDao cvLinkDao) {
        this.cvLinkDao = cvLinkDao;
    }

    @Override
    public Result add(CVLink cvLink) {
        this.cvLinkDao.save(cvLink);
        return new SuccessResult("Link Başarıyla Eklendi!");
    }

    @Override
    public Result update(CVLink cvLink) {
        this.cvLinkDao.save(cvLink);
        return new SuccessResult("Link Başarıyla Güncellendi!");
    }

    @Override
    public Result delete(int id) {
        this.cvLinkDao.deleteById(id);
        return new SuccessResult("Link Başarıyla Silindi!");
    }

    @Override
    public DataResult<List<CVLink>> getAll() {
        return new SuccessDataResult<List<CVLink>>(this.cvLinkDao.findAll());
    }

    @Override
    public DataResult<List<CVLink>> getAllByCandidateId(int id) {
        return new SuccessDataResult<List<CVLink>>(this.cvLinkDao.getAllByCandidate_Id(id));
    }
}
