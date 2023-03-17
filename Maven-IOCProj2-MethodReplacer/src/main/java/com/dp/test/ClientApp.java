package com.dp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dp.beans.CalcIntrAmt;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx;
		ctx = new FileSystemXmlApplicationContext("src/main/java/com/dp/cfgs/applicationContext.xml");
		CalcIntrAmt ca = ctx.getBean("ca", CalcIntrAmt.class);
		System.out.println(ca.regAmt(100000, 5));
	}

}
