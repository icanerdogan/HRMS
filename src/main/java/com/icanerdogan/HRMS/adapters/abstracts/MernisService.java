package com.icanerdogan.HRMS.adapters.abstracts;

import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.Candidate;

public interface MernisService {
     boolean checkIfRealPerson(Candidate candidate);
}
