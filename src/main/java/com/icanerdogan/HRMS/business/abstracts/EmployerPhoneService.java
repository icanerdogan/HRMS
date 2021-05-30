package com.icanerdogan.HRMS.business.abstracts;

import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.EmployerPhone;

public interface EmployerPhoneService {
    Result addPhone(EmployerPhone employerPhone);
}
