package com.hexaware.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.entity.BugRequest;
@SpringBootTest
class BugServiceTest {
@InjectMocks
	BugService bugService;
@Mock
BugRepository bugRepository;
@Mock
EmailClient emailClient;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCreateBug()throws Exception {
	
		BugRequest bugRequest=new BugRequest();
		bugRequest.setId(12L);
		Mockito.when(bugRepository.save(bugRequest)).thenReturn(bugRequest);
		bugService.create(bugRequest);
		assertEquals(12,bugRequest.getId());
	}

	

}
