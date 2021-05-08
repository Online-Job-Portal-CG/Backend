package com.cg.freelanceapp.serviceimpl;

import java.util.List;

import com.cg.freelanceapp.dto.BookmarkedJobDTO;
import com.cg.freelanceapp.entities.BookmarkedJob;
import com.cg.freelanceapp.exceptions.InvalidBookmarkedJobException;
import com.cg.freelanceapp.service.IBookmarkedJobService;

public class BookmarkedJobServiceImpl implements IBookmarkedJobService {

	@Override
	public BookmarkedJob bookmarkJob(BookmarkedJobDTO bookmarkedJobDto) {
		
		return null;
	}

	@Override
	public BookmarkedJob save(BookmarkedJobDTO bookmarkedJobDto) {
		return null;
	}

	@Override
	public void deleteBookmarkedJobById(Long id) {

	}

	@Override
	public List<BookmarkedJob> findBookmarkedJobsBySkillName(String skillname) {
		return null;
	}

	@Override
	public BookmarkedJob findById(Long id) throws InvalidBookmarkedJobException {
		return null;
	}

}
