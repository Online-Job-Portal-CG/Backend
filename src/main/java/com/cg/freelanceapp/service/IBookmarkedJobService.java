package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.BookmarkedJobDTO;
import com.cg.freelanceapp.dto.BookmarkedJobListDTO;
import com.cg.freelanceapp.entities.BookmarkedJob;



@Service
public interface IBookmarkedJobService {

	BookmarkedJob bookmarkJob(BookmarkedJobDTO bjd);

	List<BookmarkedJob> findBookmarkedJobsBySkillName(String name);

	BookmarkedJob findById(Long id);
	
	List<BookmarkedJobListDTO> findAllBookmarks(Long frId);

	Long getCurrentId();
	
	void remove(Long BId);

}
