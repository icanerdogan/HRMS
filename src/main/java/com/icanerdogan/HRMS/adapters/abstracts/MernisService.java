package com.icanerdogan.HRMS.adapters.abstracts;

import com.icanerdogan.HRMS.entities.concretes.Candidate;

public interface MernisService {
    public boolean checkIfRealPerson(Candidate candidate);
}
