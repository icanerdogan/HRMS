package com.icanerdogan.HRMS.business.abstracts.CV;

import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.CV.CVLanguage;

import java.util.List;

public interface CVLanguageService {
    Result add(CVLanguage cvLanguage);
    Result update(CVLanguage cvLanguage);
    Result delete(int id);

    DataResult<List<CVLanguage>> getAll();
    DataResult<List<CVLanguage>> getAllByCandidateId(int id);
}
