package com.cg.freelanceapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.IFreelancerDao;
import com.cg.freelanceapp.dao.IJobDao;
import com.cg.freelanceapp.dao.IRecruiterDao;
import com.cg.freelanceapp.dao.ISkillDao;
import com.cg.freelanceapp.dto.JobDTO;
import com.cg.freelanceapp.entities.Job;
import com.cg.freelanceapp.exceptions.InvalidJobException;
import com.cg.freelanceapp.service.IJobService;

/**
 * 
 * @author      Akash Sunil Kumar 
 * Description: This is a service implementation class for Job Entity
 *
 */

@Service
public class JobServiceImpl implements IJobService {

	@Autowired
	IJobDao jobdao;

	@Autowired
	ISkillDao skillDao;

	@Autowired
	IFreelancerDao freelancerDao;

	@Autowired
	IRecruiterDao recruiterDao;

	public void close(Long id) {
		if (jobdao.existsById(id)) {
			Job job = jobdao.findById(id).get();
			job.setActive(false);
		} else {
			throw new InvalidJobException();
		}
	}

	@Override
	public Job findById(Long id) {

		if (jobdao.existsById(id)) {
			return jobdao.findById(id).get();
		} else
			throw new InvalidJobException();

	}

	@Override

	public List<Job> findJobsBySkillName(String name) {
		if (skillDao.existsByName(name)) {
			return jobdao.findJobBySkillName(name);
		} else {
			throw new InvalidJobException();
		}

	}

	@Override
	public Job postJob(JobDTO jobdto) {
		Job job = new Job();
		if (recruiterDao.existsById(jobdto.getRecruiterId()) && freelancerDao.existsById(jobdto.getFreelancerid())
				&& skillDao.existsById(jobdto.getSkillId())) {
			job.setPostedBy(recruiterDao.findById(jobdto.getRecruiterId()).get());
			job.setAwardedTo(freelancerDao.findById(jobdto.getFreelancerid()).get());
			job.setSkill(skillDao.findById(jobdto.getSkillId()).get());
			return jobdao.save(job);
		} else
			throw new InvalidJobException();
	}

}