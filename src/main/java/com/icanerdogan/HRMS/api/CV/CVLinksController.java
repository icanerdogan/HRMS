package com.icanerdogan.HRMS.api.CV;


import com.icanerdogan.HRMS.business.abstracts.CV.CVLinkService;
import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.CV.CVLink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/links")
public class CVLinksController {
    private CVLinkService cvLinkService;

    @Autowired
    public CVLinksController(CVLinkService cvLinkService) {
        this.cvLinkService = cvLinkService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CVLink cvLink){
        return this.cvLinkService.add(cvLink);
    }

    @PostMapping("/update")
    public Result update(@RequestBody CVLink cvLink){
        return this.cvLinkService.update(cvLink);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id){
        return this.cvLinkService.delete(id);
    }


    @GetMapping("/getAll")
    public DataResult<List<CVLink>> getAll(){
        return this.cvLinkService.getAll();
    }

    @GetMapping("/getAllByCandidateId")
    public DataResult<List<CVLink>> getAllByCandidateId(@RequestParam int id){
        return this.cvLinkService.getAllByCandidateId(id);
    }
}
