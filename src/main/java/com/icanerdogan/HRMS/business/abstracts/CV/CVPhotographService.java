package com.icanerdogan.HRMS.business.abstracts.CV;

import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.CV.CVPhotograph;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CVPhotographService {

    Result add(CVPhotograph cvPhotograph, MultipartFile multipartFile);
    Result delete(CVPhotograph cvPhotograph);

    DataResult<List<CVPhotograph>> getAll();
    DataResult<List<CVPhotograph>> getById(int id);
    DataResult<List<CVPhotograph>> getAllByCandidateId(int id);
}
