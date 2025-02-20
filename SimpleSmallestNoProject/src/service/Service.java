package service;

import dao.Dao;

public class Service {
	public void smallno1() {
		Dao d1=new Dao();
		int a=d1.smallno1();
		int b=d1.smallno2();
		int c=d1.smallno3();
		
		
		if(a<=b&&a<=c) {
			System.out.println("a smallest no");
		}
		else if(b<=a&& b<=c) {
			System.out.println("b is smallest no");
		}
		else {
			System.out.println("c is smallest no");
		}
	}

}
