package com.icanerdogan.HRMS.core.utilities.results;

import com.icanerdogan.HRMS.core.utilities.results.Result;

public class SuccessResult extends Result {

    // İşlem Sonnucu Başarılı
    public SuccessResult(){
        super(true);
    }
    public SuccessResult(String message) {
        super(true, message);
    }

}
