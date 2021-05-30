package com.icanerdogan.HRMS.adapters.abstracts;

import com.icanerdogan.HRMS.entities.concretes.Employer;

public interface EmployeeConfirmationService {
    boolean employeeCheck(Employer employer);
}
