package com.sample.entities;

import java.util.Arrays;

import org.kie.api.KieServices;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	
	private static final Logger log = LoggerFactory.getLogger(Main.class);
	
	public static void main(String [] args ){
		KieServices kieServices = KieServices.Factory.get();
		KieContainer kContainer = kieServices.getKieClasspathContainer();
		StatelessKieSession kStatelesSession =kContainer.newStatelessKieSession();
		Person test = new Person();
		test.setAge(9);
//		test.setGender(Character.valueOf('F'));
		test.setGender(Character.valueOf('M'));
		kStatelesSession.execute(test);
		//kSession.execute(kieServices.getCommands().newInsertElements( Arrays.asList( new Object[] { test})));
		log.info("Resulto ->"+test.getName());
	}
}