package com.cg.freelanceapp.entities;

import java.util.List;

public class Freelancer {
	Long id;
	String firstName;
	String lastName;
	String password;
	List<JobApplication> appliedJobs;
	List<Feedback> feedbacks;
	List<SkillExperience> skills;
	List<BookmarkedJob> bookmarkedJobs;
}
