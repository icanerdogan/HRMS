package com.icanerdogan.HRMS.business.abstracts.CV;

import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.CV.CVEducation;

import java.util.List;

public interface CVEducationService {
    Result add(CVEducation cvEducation);
    Result update(CVEducation cvEducation);
    Result delete(int id);

    DataResult<List<CVEducation>> getAll();

    DataResult<List<CVEducation>> getAllByCandidateId(int id);

    DataResult<List<CVEducation>> getAllByCandidateIdOrderByGraduationYearDesc(int id);
}
