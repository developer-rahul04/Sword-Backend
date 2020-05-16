/*package com.rm.learn.springmvcanotation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.rm.learn.springmvcanotation.controller.MessagingController;

@RunWith(SpringRunner.class)
// @ContextConfiguration(classes = SpringMvcAnotationApplication.class)
@ContextConfiguration(locations="/testContext.xml")
public class XmlSpringTest {


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
*/