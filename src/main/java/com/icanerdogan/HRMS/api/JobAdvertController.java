package com.icanerdogan.HRMS.api;

import com.icanerdogan.HRMS.business.abstracts.JobAdvertService;
import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.JobAdvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/advertisements")
public class JobAdvertController {

    private JobAdvertService jobAdvertService;

    @Autowired
    public JobAdvertController(JobAdvertService jobAdvertService) {
        this.jobAdvertService = jobAdvertService;
    }

    @GetMapping("/getAll")
    public DataResult<List<JobAdvert>> getAll(){
        return this.jobAdvertService.getAll();
    }

    @PostMapping("/addAdvertisement")
    public Result addAdvertisement(@RequestBody JobAdvert jobAdvert){
        return this.jobAdvertService.addAdvertisement(jobAdvert);
    }

    @GetMapping("/findByAllActive")
    public DataResult<List<JobAdvert>> findByAllActive(){
        return this.jobAdvertService.findByAllActive();
    }

    @GetMapping("/findByActiveStatusAndCreationDateASC")
    public DataResult<List<JobAdvert>> findByActiveStatusAndCreationDateASC(){
        return this.jobAdvertService.findByActiveStatusAndCreationDateASC();
    }

    @GetMapping("/findByActiveStatusAndCreationDateDESC")
    public DataResult<List<JobAdvert>> findByActiveStatusAndCreationDateDESC(){
        return this.jobAdvertService.findByActiveStatusAndCreationDateDESC();
    }

    @PostMapping("/findByActiveStatusAndEmployer")
    public DataResult<List<JobAdvert>> findByActiveStatusAndEmployer(@RequestParam(value = "employer_id") int employer_id){
        return this.jobAdvertService.findByActiveStatusAndEmployer(employer_id);
    }

    @PutMapping("/updateActiveStatus")
    public Result updateActiveStatus(@RequestParam(value = "active") boolean active_status, @RequestParam(value = "id") int id){
        return this.jobAdvertService.updateActiveStatus(active_status,id);
    }

}
