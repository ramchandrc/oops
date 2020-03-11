package org.phone;

public class Phone {
	
	public void fetchphoneInfo(String model) {
		System.out.println(model);
		
	}
	
	public void fetchphoneInfo(int cameramp) {
		System.out.println(cameramp);
	
	}
	
	public static void main(String[] args) {
		Phone p=new Phone();
		p.fetchphoneInfo("Poco");
		p.fetchphoneInfo(64);
	}

}
