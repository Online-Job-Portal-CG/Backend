package com.cg.freelanceapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.Freelancer;

/**************************************************************************************
 * @author Vishnuvardhan 
 * Description: This is the DAO Interface for Freelancer module. 
 * Created Date: 19 April, 2021 
 * Version : v1.0.0
 *************************************************************************************/
@Repository
public interface IFreelancerDao extends JpaRepository<Freelancer, Long> {

}
