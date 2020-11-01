package com.ssi;

public class AirtelSim implements Sim{

	private String mno;
	
	
	public String getMno() {
		return mno;
	}

	public void setMno(String mno) {
		this.mno = mno;
	}

	@Override
	public void call() {
		System.out.println("Calling : "+mno);	
	}

	@Override
	public void msg() {
		System.out.println("messaging : "+mno);	
	}
}
