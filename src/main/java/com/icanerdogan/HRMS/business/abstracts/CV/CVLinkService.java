package com.icanerdogan.HRMS.business.abstracts.CV;

import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.CV.CVLink;

import java.util.List;

public interface CVLinkService {
    Result add(CVLink cvLink);
    Result update(CVLink cvLink);
    Result delete(int id);

    DataResult<List<CVLink>> getAll();
    DataResult<List<CVLink>> getAllByCandidateId(int id);
}
