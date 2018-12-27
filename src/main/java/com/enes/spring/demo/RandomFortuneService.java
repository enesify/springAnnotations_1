package com.enes.spring.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		List<String> fortuneList = new ArrayList<String>();
		int index = 0;
		fortuneList.add("You can do your best today!");
		fortuneList.add("Don't believe me :) ");
		fortuneList.add("Lies lies lies bla bla .. ");

		Random rnd = new Random();
		index = rnd.nextInt(fortuneList.size());
		System.out.println(index);

		return fortuneList.get(index);

	}

}
