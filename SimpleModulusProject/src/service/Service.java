package service;

import dao.Dao;

public class Service {
	public int modulus() {
		Dao d1=new Dao();
		int c=d1.modulus();
		return c;
	}

}
