package com.dp.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class IntrAmtCalcReplacer implements MethodReplacer {
	public float intrRate;

	public void setIntrRate(float intrRate) {
		this.intrRate = intrRate;
	}

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("class name "+obj.getClass());
		System.out.println("method name "+method);
		if(method.getName().equals("regAmt")) {
			float pamt=(Float)args[0];
			float time = (Float)args[1];
			
			float totalAmt = pamt*time*intrRate/100.f;
			return totalAmt;
			
		}
		return 0.0f;
	}

}
