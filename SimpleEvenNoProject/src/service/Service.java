package service;
import dao.Dao;
public class Service {
	public int even() {
		Dao d1=new Dao();
		int a=d1.even();
		
		if(a%2==0) {
			System.out.println("a is Even no");
		}
		
		if(a%2!=0) {
			System.out.println("a is odd no");
		}
		return a;
	}

}
