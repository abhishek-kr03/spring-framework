package com.SpringIOC.impl;

import org.springframework.context.ApplicationContext;

import com.SpringIOC.gov.PrimeMinister;
import com.SpringIOC.services.Services;

public class IndianNavy implements Services {

	ApplicationContext ac;
	
	public IndianNavy(ApplicationContext ac) {
		super();
		this.ac = ac;
	}

	@Override
	public void addressPm() {
		PrimeMinister pm = (PrimeMinister)ac.getBean("pm");
		System.out.println(pm);
	
	}

}
