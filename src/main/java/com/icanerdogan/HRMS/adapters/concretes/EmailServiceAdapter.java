package com.icanerdogan.HRMS.adapters.concretes;

import com.icanerdogan.HRMS.adapters.abstracts.EmailService;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.core.utilities.results.SuccessResult;
import com.icanerdogan.HRMS.dataAccess.abstracts.UserDao;
import com.icanerdogan.HRMS.entities.concretes.User;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceAdapter implements EmailService {
    private UserDao userDao;

    public EmailServiceAdapter(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Result sendEmail(String email) {
        return new SuccessResult("Kayıt Maili Gönderildi!");
    }

    @Override
    public boolean isEmailUsed(User user) {
        for (User u : this.userDao.findAll()){
            if (u.getEmailAdress().equals(user.getEmailAdress())){
                return false;
            }
        }
        return true;
    }

}
