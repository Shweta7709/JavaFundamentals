package controller;
import service.Service;
public class controller {
	void subb() {
		Service ss=new Service();
		int c=ss.subb();
		System.out.println(c);
	}
	public static void main(String[]args) {
		controller cc=new controller();
		cc.subb();
	}
	
}
