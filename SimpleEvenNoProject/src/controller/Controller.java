package controller;

import service.Service;

public class Controller {
	void even() {
		Service ss=new Service();
		int a= ss.even();
		System.out.println(a);
	}
	
	public static void main(String[]args) {
		Controller cc=new Controller();
		cc.even();
	}
}
