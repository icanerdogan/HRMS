package com.icanerdogan.HRMS.api;

import com.icanerdogan.HRMS.business.abstracts.EmployerPhoneService;
import com.icanerdogan.HRMS.business.abstracts.EmployerService;
import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.core.utilities.results.SuccessResult;
import com.icanerdogan.HRMS.entities.concretes.Candidate;
import com.icanerdogan.HRMS.entities.concretes.Employer;
import com.icanerdogan.HRMS.entities.concretes.EmployerPhone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
    private EmployerService employerService;
    private EmployerPhoneService employerPhoneService;

    @Autowired
    public EmployersController(EmployerService employerService, EmployerPhoneService employerPhoneService) {
        this.employerService = employerService;
        this.employerPhoneService = employerPhoneService;
    }

    @GetMapping("/allemployers")
    public DataResult<List<Employer>> getAll(){
        return this.employerService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Employer employer, @RequestBody EmployerPhone employerPhone) {
        this.employerPhoneService.addPhone(employerPhone);
        this.employerService.add(employer);

        return new SuccessResult("Employer Eklendi!");
    }
}
