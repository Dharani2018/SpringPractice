package com.dp.beans;

public class CalcIntrAmt {

	public float regAmt(float pamt, float time) {
		
		float totalAmt = pamt*time*2.0f/100;
		return totalAmt;
		
	}
}
