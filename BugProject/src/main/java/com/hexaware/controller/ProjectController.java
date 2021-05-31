package com.hexaware.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.entity.Project;
@CrossOrigin
@RestController
public class ProjectController {
	@Autowired
	IProjectService projectService;
	@RequestMapping(method = RequestMethod.POST, path = "/project")
	Long createProject(@Valid @RequestBody Project project){
		return projectService.createProject(project);
	}
}
