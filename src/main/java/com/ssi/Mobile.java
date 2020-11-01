package com.ssi;

public class Mobile {

	private Sim sim;
	
	
	
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	public void doCall() {
		sim.call();
	}
	public void domsg() {
		sim.msg();
	}
	
	
	/*
 * 	IdeaSim sim1=new IdeaSim("8359011111");
	JioSim sim2=new JioSim("8359022222");
	AirtelSim sim3= new AirtelSim("8359033333");
	
	*/
	
	
	
}
