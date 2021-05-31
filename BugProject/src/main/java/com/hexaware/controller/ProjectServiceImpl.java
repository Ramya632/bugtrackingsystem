package com.hexaware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.entity.Project;
@Service
public class ProjectServiceImpl implements IProjectService {
	@Autowired
	IProjectRepository projectRepository;
	@Override
	public Long createProject(Project project) {
		Project project2 = projectRepository.save(project);
		return project2.getId();
	}

}
