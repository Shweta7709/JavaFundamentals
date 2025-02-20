package service;

import dao.Dao;

public class Service {
	public void leap() {
		Dao d1=new Dao();
		d1.leap();
		int a=d1.leap();
		
		if(a%4==0 && a%100!=0) {
			System.out.println("year is leap year");
		}
	}

}
