package com.icanerdogan.HRMS.business.abstracts;

import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.Candidate;
import com.icanerdogan.HRMS.entities.concretes.User;

import java.util.List;

public interface CandidateService {
    DataResult<List<Candidate>> getAll();
    DataResult<Candidate> checkAllIdentificationNumber(String email);
    Result add(Candidate candidate);
}
