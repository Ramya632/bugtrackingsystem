package com.hexaware.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.hexaware.service.BugRepository;
@ExtendWith(MockitoExtension.class)

class BugControllerTest {
	@InjectMocks
	BugController bugController;
	@Mock
	BugRepository bugRepository;
	@Test
	public void testCreateBug(){
		
	}
}
