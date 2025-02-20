package controller;

import service.Service;

public class Controller {
	void div() {
		Service ss=new Service();
		int c=ss.div();
		System.out.println(c);
	}
         public static void main(String[]args) {
        	Controller cc=new Controller();
        	cc.div();
         }
}
