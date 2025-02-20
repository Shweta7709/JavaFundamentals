package service;

import dao.Dao;

public class Service {
	public int div() {
		Dao d1=new Dao();
		int c= d1.div();
		return c;
	}

}
