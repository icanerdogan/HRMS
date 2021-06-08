package com.icanerdogan.HRMS.business.concretes;

import com.icanerdogan.HRMS.business.abstracts.JobAdvertService;
import com.icanerdogan.HRMS.core.utilities.results.*;
import com.icanerdogan.HRMS.dataAccess.abstracts.JobAdvertDao;
import com.icanerdogan.HRMS.entities.concretes.JobAdvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JobAdvertManager implements JobAdvertService {
    private JobAdvertDao jobAdvertDao;

    @Autowired
    public JobAdvertManager(JobAdvertDao jobAdvertDao) {
        this.jobAdvertDao = jobAdvertDao;
    }

    @Override
    public Result addAdvertisement(JobAdvert jobAdvert) {
        this.jobAdvertDao.save(jobAdvert);
        return new SuccessResult("İş İlanı Başarıyla Eklendi!");
    }

    @Override
    public DataResult<List<JobAdvert>> getAll() {
        return new SuccessDataResult<List<JobAdvert>>
                (this.jobAdvertDao.findAll(), "Tüm İş İlanları Listelendi!");
    }

    @Override
    public DataResult<List<JobAdvert>> findByAllActive() {
        return new SuccessDataResult<List<JobAdvert>>
                (this.jobAdvertDao.findByAllActive(), "Aktif İş İlanları Listelendi!");
    }

    @Override
    public DataResult<List<JobAdvert>> findByActiveStatusAndCreationDateASC() {
        return new SuccessDataResult<List<JobAdvert>>
                (this.jobAdvertDao.findByActiveStatusAndCreationDateASC(),"İş İlanları Yeniden Eskiye Doğru Sıralandı!");
    }

    @Override
    public DataResult<List<JobAdvert>> findByActiveStatusAndCreationDateDESC() {
        return new SuccessDataResult<List<JobAdvert>>
                (this.jobAdvertDao.findByActiveStatusAndCreationDateDESC(), "İş İlanları Eskiden Yeniye Doğru Sıralandı!");
    }

    @Override
    public DataResult<List<JobAdvert>> findByActiveStatusAndEmployer(int employer_id) {
        return new SuccessDataResult<List<JobAdvert>>
                (this.jobAdvertDao.findByActiveStatusAndEmployer(employer_id), "Tüm Aktif İş İlanlarınız Listelendi!");
    }

    @Override
    public Result updateActiveStatus(boolean active_status, int id) {
        /*if (!jobAdvertDao.findAllById(id)){

         */
        this.jobAdvertDao.updateActiveStatus(active_status, id);
            return new SuccessResult(id + " Numaralı İlanının Aktiflik Durumu GÜncellendi!");
        /*}
        return new ErrorResult(id + " ID Numaralı İlan Bulunamadı!");

         */
    }
}
