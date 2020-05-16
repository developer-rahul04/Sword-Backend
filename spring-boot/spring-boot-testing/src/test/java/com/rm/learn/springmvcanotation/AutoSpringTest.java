package com.rm.learn.springmvcanotation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rm.learn.springmvcanotation.controller.MessagingController;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class AutoSpringTest {


		// Get this bean from the context
		@Autowired
		MessagingController binarySearch;

		@Test
		public void testBasicScenario() {
			
			String actualResult = binarySearch.sendMessaging();

			// check if the value is correct
			assertEquals("Facebook Message Sent", actualResult);

		}
}
