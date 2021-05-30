package com.icanerdogan.HRMS.business.concretes;

import com.icanerdogan.HRMS.business.abstracts.EmployerPhoneService;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.core.utilities.results.SuccessResult;
import com.icanerdogan.HRMS.entities.concretes.EmployerPhone;

import org.springframework.stereotype.Service;

@Service
public class EmployerPhoneManager implements EmployerPhoneService {

    // BU fonksion employers ile id bağlantısı kurulacak!
    @Override
    public Result addPhone(EmployerPhone employerPhone) {
        return new SuccessResult("Şirket Telefon NUmarası Eklendi!");
    }
}
