package com.icanerdogan.HRMS.core.utilities.upload;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import com.icanerdogan.HRMS.core.utilities.results.ErrorDataResult;
import com.icanerdogan.HRMS.core.utilities.results.SuccessDataResult;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Service
public class CVImageUploadManager implements CVImageUploadService{
    private Cloudinary cloudinary;

    public CVImageUploadManager() {

        this.cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dtimgzm07",
                "api_key", "861955374865133",
                "api_secret", "Hc30YO7WY3edIQz8iVOA700emSU"));
    }

    @Override
    public DataResult<Map> uploadImageFile(MultipartFile imageFile) {
        try {
            @SuppressWarnings("unchecked")
            Map<String, String> resultMap =(Map<String, String>) cloudinary.uploader().upload(imageFile.getBytes(), ObjectUtils.emptyMap());
            return new SuccessDataResult<Map>(resultMap);
        } catch (IOException e) {
            e.printStackTrace();

        }
        return new ErrorDataResult<Map>();
    }
}
