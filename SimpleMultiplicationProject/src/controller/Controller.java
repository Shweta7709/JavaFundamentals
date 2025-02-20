package controller;

import service.Service;

public class Controller {
	
	void mul() {
		
		Service ss=new Service();
		
	  float c=ss.mul();
	  
		System.out.println(c);
	}
     
	public static void main() {
		Controller cc=new Controller();
		cc.mul();
	}
}
