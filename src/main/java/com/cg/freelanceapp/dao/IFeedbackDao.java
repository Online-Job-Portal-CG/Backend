package com.cg.freelanceapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.Feedback;

@Repository
public interface IFeedbackDao extends JpaRepository<Feedback, Long> {

}
