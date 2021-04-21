package com.cg.freelanceapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.BookmarkedJob;
import com.cg.freelanceapp.entities.Skill;

@Repository
public interface IBookmarkedJobDao extends JpaRepository<BookmarkedJob, Long>{

	List<BookmarkedJob> findBookmarkedJobsBySkill(Skill skill);
	
}
