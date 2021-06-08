package com.icanerdogan.HRMS.api.CV;

import com.icanerdogan.HRMS.business.abstracts.CV.CVEducationService;
import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.CV.CVEducation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/educations")
public class CVEducationsController {
    private CVEducationService cvEducationService;

    @Autowired
    public CVEducationsController(CVEducationService cvEducationService) {
        this.cvEducationService = cvEducationService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CVEducation cvEducation) {
        return this.cvEducationService.add(cvEducation);
    }

    @PostMapping("/update")
    public Result update(@RequestBody CVEducation cvEducation) {
        return this.cvEducationService.update(cvEducation);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id) {
        return this.cvEducationService.delete(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<CVEducation>> getAll() {
        return this.cvEducationService.getAll();
    }

    @GetMapping("/getAllByCandidateIdOrderByGraduationYearDesc")
    public DataResult<List<CVEducation>> getAllByCandidateIdOrderByGraduationYearDesc (@RequestParam int id){
        return this.cvEducationService.getAllByCandidateIdOrderByGraduationYearDesc(id);
    }
    @GetMapping("/getAllByCandidateId")
    public DataResult<List<CVEducation>> getAllByCandidateId(@RequestParam int id){
        return this.cvEducationService.getAllByCandidateId(id);
    }
}
