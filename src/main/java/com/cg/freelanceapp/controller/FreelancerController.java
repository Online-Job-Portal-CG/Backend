package com.cg.freelanceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.dto.FreelancerDTO;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.service.IFreelancerService;

/**************************************************************************************
 * @author Vishnuvardhan 
 * Description: This is the rest controller class for Freelancer module. 
 * Created Date: 20 April, 2021 
 * Version : v1.0.0
 *************************************************************************************/
@RestController
@RequestMapping("/freelancer")
public class FreelancerController {

	@Autowired
	IFreelancerService freelancerService;
	
	/*****************************************************************************************
	 * Method      : addFreelancer       
	 * @param        freelancerDto
	 * @return       Response Entity of Object type
	 * Description : This method adds a new freelancer.
	 * @postmapping: Post mapping requests a body from the user
	 * 				 which is then persisted onto the database.
	 ****************************************************************************************/
	@PostMapping("/add")
	public ResponseEntity<Object> addFreelancer(@RequestBody FreelancerDTO freelancerDto) {
		freelancerService.save(freelancerDto);
		return new ResponseEntity<>("Added successfully", HttpStatus.OK);
	}
	
	/*****************************************************************************************
	 * Method      : getById       
	 * @param        Id
	 * @return       Freelancer object
	 * Description : This method fetches a freelancer based on the unique id.
	 * @getmapping : Get mapping expects a PathVariable to be passed 
	 *               which is then used to return the entity object 
	 *               that is fetched from the database.
	 ****************************************************************************************/
	@GetMapping("/getById/{id}")
	public Freelancer getById(@PathVariable Long id) {
		return freelancerService.findById(id);
	}
}
