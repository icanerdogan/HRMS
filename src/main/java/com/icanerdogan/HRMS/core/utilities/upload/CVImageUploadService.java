package com.icanerdogan.HRMS.core.utilities.upload;

import com.icanerdogan.HRMS.core.utilities.results.DataResult;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface CVImageUploadService {

    DataResult<Map> uploadImageFile(MultipartFile imageFile);
}
