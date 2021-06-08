package com.icanerdogan.HRMS.business.abstracts.CV;

import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.CV.CVAbility;

import java.util.List;

public interface CVAbilityService {
    Result add(CVAbility cvAbility);
    Result delete(int id);
    Result update(CVAbility cvAbility);

    DataResult<List<CVAbility>> getAll();

    DataResult<List<CVAbility>> getAllByCandidateId(int id);
}
