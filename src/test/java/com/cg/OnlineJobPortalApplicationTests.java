package com.cg;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.cg.freelanceapp.dto.BookmarkedFreelancerDTO;
//import com.cg.freelanceapp.dto.FreelancerDTO;
//import com.cg.freelanceapp.entities.BookmarkedFreelancer;
//import com.cg.freelanceapp.service.IBookmarkedFreelancerService;
//import com.cg.freelanceapp.service.IFreelancerService;
//import com.cg.freelanceapp.service.IRecruiterService;
//import com.cg.freelanceapp.service.ISkillService;
//
//@SpringBootTest
class OnlineJobPortalApplicationTests {
//
//	@Autowired
//	ISkillService skillService;
//
//	@Autowired
//	IBookmarkedFreelancerService bookmarkedFreelancerService;
//
//	@Autowired
//	IRecruiterService recruiterService;
//
//	@Autowired
//	IFreelancerService freelancerService;
//
////	@Test
////	void testAddSkill() {
////		Skill skill = new Skill("java222", "java skill");
////		skillService.save(skill);
////		Long id = skillService.getCurrentId();
////		assertEquals("java skill", skillService.findById(id).getDescription());
////	}
////
////	@Test
////	void testAddRecruiter() {
////		RecruiterDTO recruiter = new RecruiterDTO("John", "Doe");
////		recruiterService.save(recruiter);
////		Long id = recruiterService.getCurrentId();
////		assertEquals("Doe", recruiterService.findById(id).getLastName());
////	}
//
//	@Test
//	void testAddFreelancer() {
//		FreelancerDTO freelancer = new FreelancerDTO("John", "Doe", "password123");
//		freelancerService.save(freelancer);
//		Long id = freelancerService.getCurrentId();
//		assertEquals("password123", freelancerService.findById(id).getPassword());
//	}
//
//	@Test
//	void testAddBookmarkFreelancer() {
//		BookmarkedFreelancerDTO bookedfreelancer = new BookmarkedFreelancerDTO(1L, 2L, 2L);
//		BookmarkedFreelancer bookmark = bookmarkedFreelancerService.save(bookedfreelancer);
//		System.out.println(bookmark.getId());
//		String password = "password123##";
//		assertEquals("password123##", password);
//	}
}
