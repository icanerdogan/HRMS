package com.icanerdogan.HRMS.adapters.concretes;


import com.icanerdogan.HRMS.adapters.abstracts.MernisService;
import com.icanerdogan.HRMS.entities.concretes.Candidate;
import org.springframework.stereotype.Component;

@Component
public class MernisServiceAdapter implements MernisService {

	@Override
	public boolean checkIfRealPerson(Candidate candidate) {
		return true;
	}
}
