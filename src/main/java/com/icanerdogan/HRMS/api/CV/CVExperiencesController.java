package com.icanerdogan.HRMS.api.CV;

import com.icanerdogan.HRMS.business.abstracts.CV.CVExperienceService;
import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.CV.CVExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/experiences")
public class CVExperiencesController {
    private CVExperienceService cvExperienceService;

    @Autowired
    public CVExperiencesController(CVExperienceService cvExperienceService) {
        this.cvExperienceService = cvExperienceService;
    }
    @PostMapping("/add")
    public Result add(@RequestBody CVExperience cvExperience) {
        return this.cvExperienceService.add(cvExperience);
    }

    @PostMapping("/update")
    public Result update(@RequestBody CVExperience cvExperience) {
        return this.cvExperienceService.update(cvExperience);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id) {
        return this.cvExperienceService.delete(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<CVExperience>> getAll() {
        return this.cvExperienceService.getAll();
    }

    @GetMapping("/getAllByCandidateIdOrderByLeaveDateDesc")
    public DataResult<List<CVExperience>> getAllByCandidateIdOrderByLeaveDateDesc(@RequestParam("id") int id){
        return this.cvExperienceService.getAllByCandidateIdOrderByLeaveDateDesc(id);
    }

    @GetMapping("/getAllByCandidateId")
    public DataResult<List<CVExperience>> getAllByCandidateId(@RequestParam int id){
        return this.cvExperienceService.getAllByCandidateId(id);
    }
}
