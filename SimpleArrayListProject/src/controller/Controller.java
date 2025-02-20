package controller;

import java.util.ArrayList;

import service.Service;

public class Controller {
	
	public void addRollNumber() { 
		
		Service ss = new Service();
		
		 ArrayList<Integer> al	= ss.addRollNumber();
		 
		 System.out.println(al);
		 
	}
	
	public static void main (String[]args) {
		
		Controller cc = new Controller();
		
		cc.addRollNumber();
	}

}