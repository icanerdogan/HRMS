package com.icanerdogan.HRMS.business.concretes;

import com.icanerdogan.HRMS.adapters.abstracts.EmailService;
import com.icanerdogan.HRMS.adapters.concretes.EmailServiceAdapter;
import com.icanerdogan.HRMS.adapters.concretes.MernisServiceAdapter;
import com.icanerdogan.HRMS.business.abstracts.UserService;
import com.icanerdogan.HRMS.core.utilities.regex.RegexEmail;
import com.icanerdogan.HRMS.core.utilities.regex.RegexPassword;
import com.icanerdogan.HRMS.core.utilities.results.*;
import com.icanerdogan.HRMS.dataAccess.abstracts.UserDao;
import com.icanerdogan.HRMS.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {
    private UserDao userDao;
    private RegexEmail regexEmail;
    private RegexPassword regexPassword;
    private EmailServiceAdapter emailServiceAdapter;

    @Autowired
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public Result addUser(User user) {
        //this.userDao.save(user);
        String userMail = user.getEmailAdress();
        String userPassword = user.getPassword();
        String rUserPassword = user.getRPassword();

        if (regexEmail.validate(userMail) && !regexPassword.validate(userPassword)) {
            if (userPassword.equals(rUserPassword)) {
                return new SuccessResult("Kullanıcı Eklendi!");
            }
        }

        if (!emailServiceAdapter.isEmailUsed(user)){
            return new SuccessResult("Kullanılmayan, Geçerli Bir E-Posta Girdiniz! Kayıt Başarılı!");
        }

        emailServiceAdapter.sendEmail(userMail);

        return new ErrorResult("Kullanıcı Ekleme İşlemi Başarısız!");

    }


}
