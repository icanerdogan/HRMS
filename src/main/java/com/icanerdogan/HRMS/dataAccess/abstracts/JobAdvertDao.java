package com.icanerdogan.HRMS.dataAccess.abstracts;

import com.icanerdogan.HRMS.entities.concretes.JobAdvert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer> {


    //boolean findAllById(int id);

    @Query("From JobAdvert j where j.active_status=:true")
    List<JobAdvert> findByAllActive();

    @Query("From JobAdvert j where j.active_status=:true order by j.creation_date ASC")
    List<JobAdvert> findByActiveStatusAndCreationDateASC();

    @Query("From JobAdvert j where j.active_status=:true order by j.creation_date DESC")
    List<JobAdvert> findByActiveStatusAndCreationDateDESC();

    @Query("From JobAdvert j where j.active_status=:true and j.employer.id=:employer_id")
    List<JobAdvert> findByActiveStatusAndEmployer(int employer_id);

    @Transactional
    @Modifying
    @Query("update JobAdvert j set j.active_status=:active where j.id=:id")
    void updateActiveStatus(boolean active_status, int id);


}
