package com.icanerdogan.HRMS.business.concretes;

import com.icanerdogan.HRMS.adapters.abstracts.EmailService;
import com.icanerdogan.HRMS.adapters.concretes.EmployeeConfirmationAdapter;
import com.icanerdogan.HRMS.business.abstracts.EmployerService;
import com.icanerdogan.HRMS.core.utilities.results.*;
import com.icanerdogan.HRMS.dataAccess.abstracts.EmployerDao;
import com.icanerdogan.HRMS.entities.concretes.Candidate;
import com.icanerdogan.HRMS.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;
    private EmailService emailService;
    private EmployeeConfirmationAdapter employeeConfirmationAdapter;


    @Autowired
    public EmployerManager(EmployerDao employerDao, EmailService emailService) {
        this.employerDao = employerDao;
        this.emailService = emailService;
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Tüm İş Verenler Listelendi!");
    }

    @Override
    public Result add(Employer employer) {
        if (employeeConfirmationAdapter.employeeCheck(employer)){
            return new SuccessResult("İş Veren Başarıyla Eklendi! Yönetici Tarafından Onaylandı!");
        }
        return new ErrorResult("İş Veren Onaylanmadı!");
    }
}
