package com.icanerdogan.HRMS.business.abstracts.CV;

import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.CV.CVCoverLetter;

import java.util.List;

public interface CVCoverLetterService {
    Result add(CVCoverLetter cvCoverLetter);
    Result update(CVCoverLetter cvCoverLetter);
    Result delete(int id);

    DataResult<List<CVCoverLetter>> getAll();

    DataResult<List<CVCoverLetter>> getAllByCandidateId(int id);

}
