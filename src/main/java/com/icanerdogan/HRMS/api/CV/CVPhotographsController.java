package com.icanerdogan.HRMS.api.CV;

import com.icanerdogan.HRMS.business.abstracts.CV.CVPhotographService;
import com.icanerdogan.HRMS.business.abstracts.CandidateService;
import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.CV.CVPhotograph;
import com.icanerdogan.HRMS.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("api/photographs")
public class CVPhotographsController {

    private CVPhotographService cvPhotographService;

    @Autowired
    public CVPhotographsController(CVPhotographService cvPhotographService) {
        this.cvPhotographService = cvPhotographService;
    }

    @PostMapping(value = "/add")
    public Result add(@RequestBody MultipartFile file, @RequestParam("id") int id) {
        CVPhotograph cvPhotograph = new CVPhotograph();
        Candidate candidate = new Candidate();
        candidate.setId(id);
        cvPhotograph.setCandidate(candidate);
        return this.cvPhotographService.add(cvPhotograph, file);
    }


    @DeleteMapping("/delete")
    public Result delete(@RequestBody CVPhotograph cvPhotograph) {
        return this.cvPhotographService.delete(cvPhotograph);
    }

    @GetMapping("/getAll")
    public DataResult<List<CVPhotograph>> getAll() {
        return this.cvPhotographService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<List<CVPhotograph>> getById(@RequestParam("id") int id) {
        return this.cvPhotographService.getById(id);
    }

    @GetMapping("/getAllByCandidateId")
    public DataResult<List<CVPhotograph>> getAllByCandidateId(@RequestParam("candidate_id") int id) {
        return this.cvPhotographService.getAllByCandidateId(id);
    }

}
