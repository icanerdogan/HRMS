package com.icanerdogan.HRMS.api.CV;

import com.icanerdogan.HRMS.business.abstracts.CV.CVCoverLetterService;
import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.CV.CVCoverLetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/coverletters")
public class CVCoverLettersController {
    private CVCoverLetterService cvCoverLetterService;

    @Autowired
    public CVCoverLettersController(CVCoverLetterService cvCoverLetterService) {
        this.cvCoverLetterService = cvCoverLetterService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CVCoverLetter cvCoverLetter) {
        return this.cvCoverLetterService.add(cvCoverLetter);
    }

    @PostMapping("/update")
    public Result update(@RequestBody CVCoverLetter cvCoverLetter) {
        return this.cvCoverLetterService.update(cvCoverLetter)	;

    }
    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id) {
        return this.cvCoverLetterService.delete(id);

    }

    @GetMapping("/getAll")
    public DataResult<List<CVCoverLetter>> getAll(){
        return this.cvCoverLetterService.getAll();
    }

    @GetMapping("/getAllByCandidateId")
    public DataResult<List<CVCoverLetter>> getAllByCandidateId(@RequestParam int id){
        return this.cvCoverLetterService.getAllByCandidateId(id);
    }
}
