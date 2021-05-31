package com.hexaware.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.entity.BugRequest;

public interface BugRepository extends JpaRepository<BugRequest, Long>{

}
