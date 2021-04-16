package com.cg.freelanceapp.entities;

import java.time.LocalDate;
import java.util.List;

public class Job {
	Long id;
	Skill skill;
	Recruiter postedBy;
	LocalDate postedDate;
	Freelancer awardedTo;
	List<JobApplication> jobApplications;
	Boolean active;
}
