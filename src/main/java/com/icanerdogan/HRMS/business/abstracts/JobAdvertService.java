package com.icanerdogan.HRMS.business.abstracts;

import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.JobAdvert;

import java.util.List;

public interface JobAdvertService {
    Result addAdvertisement(JobAdvert jobAdvert);

    DataResult<List<JobAdvert>> getAll();

    DataResult<List<JobAdvert>> findByAllActive();

    DataResult<List<JobAdvert>> findByActiveStatusAndCreationDateASC();

    DataResult<List<JobAdvert>> findByActiveStatusAndCreationDateDESC();

    DataResult<List<JobAdvert>> findByActiveStatusAndEmployer(int employer_id);

    Result updateActiveStatus(boolean active_status, int id);
}
