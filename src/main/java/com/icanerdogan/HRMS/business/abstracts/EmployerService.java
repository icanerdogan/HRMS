package com.icanerdogan.HRMS.business.abstracts;

import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employer>> getAll();
    Result add(Employer employer);
}
