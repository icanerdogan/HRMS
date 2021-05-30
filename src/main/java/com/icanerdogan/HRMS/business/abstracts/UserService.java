package com.icanerdogan.HRMS.business.abstracts;

import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.User;

public interface UserService {
    Result addUser(User user);
}
