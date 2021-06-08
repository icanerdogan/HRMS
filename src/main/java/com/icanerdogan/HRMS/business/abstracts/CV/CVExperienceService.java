package com.icanerdogan.HRMS.business.abstracts.CV;

import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.CV.CVExperience;

import java.util.List;

public interface CVExperienceService {
    Result add(CVExperience cvExperience);
    Result update(CVExperience cvExperience);
    Result delete(int id);

    DataResult<List<CVExperience>> getAll();

    DataResult<List<CVExperience>> getAllByCandidateId(int id);

    DataResult<List<CVExperience>> getAllByCandidateIdOrderByLeaveDateDesc(int id);
}
