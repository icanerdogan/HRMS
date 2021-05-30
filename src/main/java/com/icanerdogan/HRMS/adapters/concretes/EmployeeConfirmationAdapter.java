package com.icanerdogan.HRMS.adapters.concretes;

import com.icanerdogan.HRMS.adapters.abstracts.EmployeeConfirmationService;
import com.icanerdogan.HRMS.core.utilities.results.SuccessResult;
import com.icanerdogan.HRMS.entities.concretes.Employer;

public class EmployeeConfirmationAdapter implements EmployeeConfirmationService {
    @Override
    public boolean employeeCheck(Employer employer) {
        return true;
    }
}
