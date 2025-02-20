package service;

import dao.Dao;

public class Service {
	public void positive() {
		Dao d1=new Dao();
		int a=d1.positive();
		
		if (a>0) {
	System.out.println("a is positive number");		
	}
		}

}
