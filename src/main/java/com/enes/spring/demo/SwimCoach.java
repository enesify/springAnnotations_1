package com.enes.spring.demo;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SwimCoach implements Coach {
	
	@Autowired //-> reflection : no need constructor or setter methods for injection
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "For your health, swim everyday :) ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	@PreDestroy
	public void getMetadata() {
		System.out.println("email: " + email);
		System.out.println("team: " + team);
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
