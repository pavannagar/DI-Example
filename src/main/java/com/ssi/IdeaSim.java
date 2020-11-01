package com.ssi;


public class IdeaSim implements Sim {

	public String getMno() {
		return mno;
	}

	public void setMno(String mno) {
		this.mno = mno;
	}

	private String mno;
	
			  
	  @Override public void call() { System.out.println("Calling : "+mno); }
	  
	  @Override public void msg() { System.out.println("messaging : "+mno); }
	 

}
