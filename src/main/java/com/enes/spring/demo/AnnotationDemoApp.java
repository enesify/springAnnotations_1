package com.enes.spring.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	
	private static final Logger LOGGER = LogManager.getLogger(AnnotationDemoApp.class);

	public static void main(String[] args) {

		//read spring file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean form spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//Coach baseballCoach = context.getBean("baseballCoach",Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		//System.out.println(baseballCoach.getDailyWorkout());
		
		//call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
