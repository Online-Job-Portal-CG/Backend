package com.cg.freelanceapp.dao;
import java.util.List;

/**************************************************************************************
 * @author       Amruth N 
 * Description : This is the DAO Interface for SkillExperience module. 
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.dto.SkillExperienceListDTO;
import com.cg.freelanceapp.entities.SkillExperience;

@Repository
public interface ISkillExperienceDao extends JpaRepository<SkillExperience, Long>{

	@Query(value = "select hibernate_id_seq.currval from dual", nativeQuery = true)
	 Long getCurrentSeriesId();
	
	@Query(value ="select new com.cg.freelanceapp.dto.SkillExperienceListDTO(se.id, se.skill.id, se.skill.name, se.years, f.id, CONCAT(f.firstName, ' ', f.lastName), f.userName) from SkillExperience se, Freelancer f where f.id=:id and se.freelancer.id = :id order by se.id")
	List<SkillExperienceListDTO> findByFreelancerId(@Param("id") Long freelancerId);
	
	@Query(value = "select se from SkillExperience se where se.freelancer.id = :id order by se.id")
	List<SkillExperience> findByFreelancer(@Param("id") Long freelancerId);
	
	@Query(value = "select se from SkillExperience se where se.freelancer.id = :frId and se.skill.id = :sId order by se.id")
	SkillExperience findBySkillIdAndFreelancerId(@Param("sId") Long skillId, @Param("frId") Long freelancerId);
}