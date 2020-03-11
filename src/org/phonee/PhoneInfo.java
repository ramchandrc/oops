package org.phonee;

public class PhoneInfo {
	
	public void phoneName() {
		System.out.println("Redmi");
	}
	
	public void imeiNum() {
		System.out.println("12345");
	}
	
	public void cameraMp() {
		System.out.println("12Mp");
	}
	
	public void storage() {
		System.out.println("8Gb");
	}
	
	public void osName() {
		System.out.println("Pie");
	}
	
	public static void main(String[] args) {
		PhoneInfo p=new PhoneInfo();
		p.phoneName();
		p.imeiNum();
		p.cameraMp();
		p.storage();
		p.osName();
	}

}
