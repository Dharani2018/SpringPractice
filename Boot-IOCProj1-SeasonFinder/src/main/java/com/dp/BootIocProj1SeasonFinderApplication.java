package com.dp;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.dp.beans.SeasonFinder;

@SpringBootApplication
public class BootIocProj1SeasonFinderApplication {
	
	@Bean(name = "ldt")
	public static LocalDateTime createLDT() {
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ApplicationContext ctx =   SpringApplication.run(BootIocProj1SeasonFinderApplication.class, args);
		SeasonFinder sf = ctx.getBean("sf", SeasonFinder.class);
		System.out.println(sf.findSeason("Varnika Parimella"));
	}

}
