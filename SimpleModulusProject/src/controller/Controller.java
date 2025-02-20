package controller;
import service.Service;
public class Controller {
	void modulus() {
		Service ss =new Service();
		int c=ss.modulus();
		System.out.println(c);
		
	}
    public static void main(String[]args) {
    	Controller cc=new Controller();
    	cc.modulus();
    }
}
