package com.dp.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	
	@Autowired
	private LocalDateTime ldt;
	
	public String findSeason(String name) {
		int month = ldt.getMonthValue();
		if(month >=3 && month <=7) {
			return "hi "+name +" this is summer season";
		}else if(month >7 && month <=11) {
			return "hi "+name +" this is rainy season";
		}else {
			return "hi "+name +" this is winter season";			
		}
			
	}

}
