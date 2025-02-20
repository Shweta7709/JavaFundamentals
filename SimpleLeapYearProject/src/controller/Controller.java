package controller;

import service.Service;

public class Controller {
	
	void leap() {
		Service ss=new Service();
		ss.leap();
	}
	
	public static void main(String[]args) {
		
		Controller cc=new Controller();
		cc.leap();
	}

}
