package controller;
import service.Service;
public class Controller {
	public void smallno() {
  Service ss=new Service();
  ss.smallno1();
	}
	public static void main(String[]args) {
		Controller cc=new Controller();
		cc.smallno();
	}
}
