package service;

import dao.Dao;

public class Service {
	
	public void largestno() {
		Dao d1=new Dao();
		int a= d1.largestno();
	    int b=d1.largestno1();
	    
	    d1.largestno();
		
		if (a>b) {
			System.out.println("a is largest number");
		       }
		}
	
	

}
