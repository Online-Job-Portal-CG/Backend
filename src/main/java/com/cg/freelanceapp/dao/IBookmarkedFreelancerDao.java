package com.cg.freelanceapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.BookmarkedFreelancer;
import com.cg.freelanceapp.entities.Skill;

@Repository
public interface IBookmarkedFreelancerDao extends JpaRepository<BookmarkedFreelancer, Long> {
	List<BookmarkedFreelancer> findBookmarkedFreelancerBySkillId(Long id);
}
