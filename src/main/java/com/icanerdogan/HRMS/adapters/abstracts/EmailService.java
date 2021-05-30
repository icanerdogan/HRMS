package com.icanerdogan.HRMS.adapters.abstracts;

import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.User;

public interface EmailService {
    Result sendEmail(String email);

    boolean isEmailUsed(User user);
}
