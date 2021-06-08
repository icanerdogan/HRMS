package com.icanerdogan.HRMS.business.concretes.CV;

import com.icanerdogan.HRMS.business.abstracts.CV.CVPhotographService;
import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.core.utilities.results.SuccessDataResult;
import com.icanerdogan.HRMS.core.utilities.results.SuccessResult;
import com.icanerdogan.HRMS.core.utilities.upload.CVImageUploadService;
import com.icanerdogan.HRMS.dataAccess.abstracts.CV.CVPhotographDao;
import com.icanerdogan.HRMS.entities.concretes.CV.CVPhotograph;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Service
public class CVPhotographManager implements CVPhotographService {
    private CVPhotographDao cvPhotographDao;
    private CVImageUploadService cvImageUploadService;

    @Autowired
    public CVPhotographManager(CVPhotographDao cvPhotographDao, CVImageUploadService cvImageUploadService) {
        this.cvPhotographDao = cvPhotographDao;
        this.cvImageUploadService = cvImageUploadService;
    }

    @Override
    public Result add(CVPhotograph cvPhotograph, MultipartFile multipartFile) {
        Map<String, String> result = this.cvImageUploadService.uploadImageFile(multipartFile).getData();
        String url = result.get("url");
        cvPhotograph.setPhotoLink(url);
        return new SuccessResult("Fotoğraf Başarıyla Eklendi!");
    }

    @Override
    public Result delete(CVPhotograph cvPhotograph) {
        this.cvPhotographDao.delete(cvPhotograph);
        return new SuccessResult("Fotoğraf Başarıyla Silindi!");
    }

    @Override
    public DataResult<List<CVPhotograph>> getAll() {
        return new SuccessDataResult<>(this.cvPhotographDao.findAll());
    }

    @Override
    public DataResult<List<CVPhotograph>> getById(int id) {
        return new SuccessDataResult<>(this.cvPhotographDao.getById(id));
    }

    @Override
    public DataResult<List<CVPhotograph>> getAllByCandidateId(int id) {
        return new SuccessDataResult<>(this.cvPhotographDao.getByCandidate_Id(id));
    }
}
