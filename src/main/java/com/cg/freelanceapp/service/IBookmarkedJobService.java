package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.BookmarkedJobDTO;
import com.cg.freelanceapp.entities.BookmarkedJob;
import com.cg.freelanceapp.exceptions.InvalidBookmarkedJobException;

@Service
public interface IBookmarkedJobService {

	BookmarkedJob bookmarkJob(BookmarkedJobDTO bookmarkedJobDto);

	BookmarkedJob save(BookmarkedJobDTO bookmarkedJobDto);

	void deleteBookmarkedJobById(Long id);

	List<BookmarkedJob> findBookmarkedJobsBySkillName(String skillname);

	BookmarkedJob findById(Long id) throws InvalidBookmarkedJobException;


}
