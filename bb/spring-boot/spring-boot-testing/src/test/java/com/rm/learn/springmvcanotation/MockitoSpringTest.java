package com.rm.learn.springmvcanotation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rm.learn.springmvcanotation.controller.MessagingController;
import com.rm.learn.springmvcanotation.service.MessagingService;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class MockitoSpringTest {

	@InjectMocks
	MessagingController controller;

	@Mock
	MessagingService service; //dd

	@Test
	public void testBasicScenarioFacebook() {
		Mockito.when(service.sendMessaging()).thenReturn("Facebook");
		String result = controller.sendMessaging();
		assertNotNull(result);
		assertEquals("Facebook", result);
	}

	@Test
	public void testBasicScenarioWhatApp() {
		Mockito.when(service.sendMessaging()).thenReturn("WhatApp");
		String result = controller.sendMessaging();
		assertNotNull(result);
		assertEquals("WhatApp", result);
	}

}
