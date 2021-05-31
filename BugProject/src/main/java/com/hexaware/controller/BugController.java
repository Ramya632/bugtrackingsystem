package com.hexaware.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.entity.BugRequest;
import com.hexaware.service.BugService;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
public class BugController {
	@Autowired
	BugService bugService;

	@GetMapping("/bug")
	public List<BugRequest> getBugs() {
		System.out.println("Get Request");
		return bugService.getAllBugs();
	}

	@GetMapping(value = "/bug/{id}")
	public BugRequest getBug(@PathVariable Long id) {
		return bugService.getBug(id).orElse(null);
	}

	@PostMapping(value = "/bug")
	@ApiOperation(consumes = "application/json", value = "create Bug")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Long createNewBug(@Valid @RequestBody BugRequest bugRequest) throws Exception {
		bugService.create(bugRequest);
		return bugRequest.getId();
	}

	@PutMapping(value = "/bug/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public Long updateBug(@RequestBody BugRequest bugRequest, @PathVariable Long id) {
		bugService.updateBug(bugRequest, id);
		return bugRequest.getId();

	}

	@DeleteMapping(value = "/bug/{id}")
	public void deleteBug(@PathVariable Long id) {
		System.out.println("update bug called");
	}
}
