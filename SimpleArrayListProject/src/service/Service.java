
package service;

import java.util.ArrayList;

import dao.Dao;

public class Service {
	public ArrayList<Integer>addRollNumber(){
		
		Dao d1 = new Dao();
		
		 ArrayList<Integer> al = d1.addRollNumber();
		 
		 return al;
		
	}
}