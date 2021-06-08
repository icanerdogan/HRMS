package com.icanerdogan.HRMS.api.CV;

import com.icanerdogan.HRMS.business.abstracts.CV.CVLanguageService;
import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.CV.CVLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/languages")
public class CVLanguagesController {
    private CVLanguageService cvLanguageService;

    @Autowired
    public CVLanguagesController(CVLanguageService cvLanguageService) {
        this.cvLanguageService = cvLanguageService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CVLanguage cvLanguage) {
        return this.cvLanguageService.add(cvLanguage);
    }

    @PostMapping("/update")
    public Result update(@RequestBody CVLanguage cvLanguage) {
        return this.cvLanguageService.update(cvLanguage);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam("id") int id) {
        return this.cvLanguageService.delete(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<CVLanguage>> getAll() {
        return this.cvLanguageService.getAll();
    }

    @GetMapping("/getAllByJobSeekerId")
    public DataResult<List<CVLanguage>> getAllByCandidateId(@RequestParam int id) {
        return this.cvLanguageService.getAllByCandidateId(id);

    }
}
