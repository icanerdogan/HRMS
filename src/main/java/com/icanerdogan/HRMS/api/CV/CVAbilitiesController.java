package com.icanerdogan.HRMS.api.CV;

import com.icanerdogan.HRMS.business.abstracts.CV.CVAbilityService;
import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.CV.CVAbility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/abilities")
public class CVAbilitiesController {
    private CVAbilityService cvAbilityService;

    @Autowired
    public CVAbilitiesController(CVAbilityService cvAbilityService) {
        this.cvAbilityService = cvAbilityService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CVAbility cvAbility){
        return this.cvAbilityService.add(cvAbility);
    }

    @PostMapping("/update")
    public Result update(@RequestBody CVAbility cvAbility){
        return this.cvAbilityService.update(cvAbility);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id){
        return this.cvAbilityService.delete(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<CVAbility>> getAll(){
        return this.cvAbilityService.getAll();
    }

    @GetMapping("/getAllByCandidateId")
    public DataResult<List<CVAbility>> getAllByJobseekerId(@RequestParam int id){
        return this.cvAbilityService.getAllByCandidateId(id);
    }
}
