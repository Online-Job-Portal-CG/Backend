package com.cg.freelanceapp.entities;

import java.util.List;

public class Recruiter {
	Long id;
	String firstName;
	String lastName;
	List<Job> postedJobs;
	List<Feedback> feedbacks;
	List<BookmarkedFreelancer> freelancers;
}
