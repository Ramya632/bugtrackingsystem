package com.hexaware.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.entity.BugRequest;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixException;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@Service
public class BugService {
	@Autowired
	BugRepository bugRepository;
	@Autowired
	EmailClient emailClient;
	@Transactional(rollbackOn = Exception.class, dontRollbackOn = { ArithmeticException.class,
			IllegalArgumentException.class })
//	@HystrixCommand(fallbackMethod = "fallback1")
	public Long create(BugRequest bugRequest) throws Exception {
		
		
//		childMethod(bugRequest);
		bugRepository.save(bugRequest);
		return bugRequest.getId();
		
//		throw new Exception();
	}
	public Optional<BugRequest> getBug(Long id)
	{
		return bugRepository.findById(id);
	}
	public Long updateBug(BugRequest bugRequest,Long id)
	{
		System.out.println(bugRequest.getId());
		BugRequest bug = bugRepository.findById(id).get();
		bug.setEmailAddress(bugRequest.getEmailAddress());
	bug.setPriority(bugRequest.getPriority());
	bug.setStatus(bugRequest.getStatus());
		bugRepository.save(bug);
		return bugRequest.getId();
	}
	public List<BugRequest> getAllBugs()
	{
		return bugRepository.findAll();
		
	}
	
	public void fallback1(BugRequest bugRequest) {
		System.out.println("fallback called...");
	}
	


}
