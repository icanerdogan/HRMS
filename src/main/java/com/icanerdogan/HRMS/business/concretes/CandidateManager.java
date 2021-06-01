package com.icanerdogan.HRMS.business.concretes;

import com.icanerdogan.HRMS.adapters.concretes.MernisServiceAdapter;
import com.icanerdogan.HRMS.business.abstracts.CandidateService;
import com.icanerdogan.HRMS.core.utilities.results.*;
import com.icanerdogan.HRMS.dataAccess.abstracts.CandidateDao;
import com.icanerdogan.HRMS.entities.concretes.Candidate;
import com.icanerdogan.HRMS.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {
    CandidateDao candidateDao;
    MernisServiceAdapter mernisServiceAdapter;

    @Autowired
    public CandidateManager(CandidateDao candidateDao) {
        this.candidateDao = candidateDao;
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>>
                (this.candidateDao.findAll(), "Tüm Adaylar Listelendi!");
    }

    //Tüm Candidates içinden kontrol TC Kimlik numaraası kontrolü
    @Override
    public DataResult<Candidate> checkAllIdentificationNumber(String identificationNumber) {
        return new ErrorDataResult<Candidate>(candidateDao.findByIdentificationnumber(identificationNumber));
    }

    @Override
    public Result add(Candidate candidate) {
        //this.candidateDao.save(candidate);
        String firstName = candidate.getFirstname();
        String lastName = candidate.getLastname();
        String identificationnumber = candidate.getIdentificationnumber();
        String birthdate = candidate.getBirthdate();

        if (firstName == null || lastName== null ||
            identificationnumber == null || birthdate == null){
            return new ErrorResult("Boş Alan Bırakılmaz!");
        }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> hafta 8
        if (!mernisServiceAdapter.checkIfRealPerson(candidate)){
            return new ErrorResult("Kimlik Doğrulanamadı!");
        }

        return new SuccessResult("İş Arayan Eklendi!");
<<<<<<< HEAD
=======
=======
        if(!mernisServiceAdapter.checkIfRealPerson(candidate)){
            return new ErrorResult("Kimlik Doğrulama İşlemi Başarısız!");
        }

        return new SuccessResult("Kayıt İşlemi Başarılı!");
>>>>>>> hafta 8
>>>>>>> hafta 8
    }

}