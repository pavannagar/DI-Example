package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Mobile m=context.getBean("mobile",Mobile.class);
		m.doCall();
		m.domsg();
		
		
		/*
		 * IdeaSim sim1=new IdeaSim("8359011111"); JioSim sim2=new JioSim("8359022222");
		 * AirtelSim sim3= new AirtelSim("8359033333");
		 * 
		 * 
		 * Mobile mobile=new Mobile(); mobile.setSim(sim1); mobile.doCall();
		 * mobile.domsg();
		 */

	}

}
