package com.icanerdogan.HRMS.adapters.concretes;


import com.icanerdogan.HRMS.adapters.abstracts.MernisService;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> hafta 8
import com.icanerdogan.HRMS.entities.concretes.Candidate;
import org.springframework.stereotype.Component;

@Component
public class MernisServiceAdapter implements MernisService {

	@Override
	public boolean checkIfRealPerson(Candidate candidate) {
		return true;
<<<<<<< HEAD
=======
=======
import com.icanerdogan.HRMS.core.utilities.results.ErrorResult;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.core.utilities.results.SuccessResult;
import com.icanerdogan.HRMS.entities.concretes.Candidate;
import mernis.TPAKPSPublicSoap;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MernisServiceAdapter implements MernisService {


	@Override
	public boolean checkIfRealPerson(Candidate candidate) {
		String dogum = candidate.getBirthdate();
		String[] dates = dogum.split(".");
		int year = Integer.parseInt(dates[0]);

		boolean result = true;

		TPAKPSPublicSoap tpakpsPublicSoap = new TPAKPSPublicSoap();

		try {
			result = tpakpsPublicSoap.TCKimlikNoDogrula(
					Long.parseLong(candidate.getIdentificationnumber()),
					candidate.getFirstname().toUpperCase(),
					candidate.getLastname().toUpperCase(),
					year
			);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if(result) {
			return true;
		}else {
			return false;
		}
>>>>>>> hafta 8
>>>>>>> hafta 8
	}
}
