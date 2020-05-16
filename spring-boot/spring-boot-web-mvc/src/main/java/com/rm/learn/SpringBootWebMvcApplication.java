package com.rm.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication //  same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootWebMvcApplication extends SpringBootServletInitializer  {


	   @Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(SpringBootWebMvcApplication.class);
	   }
	   public static void main(String[] args) {
	      SpringApplication.run(SpringBootWebMvcApplication.class, args);
	   }

}
