package org.companyq;

public class CompanyInfo {
	
	public void companyName() {
		System.out.println("Name");
	}
	
	public void companyId() {
		System.out.println("Id");
	}
	
	public void companyAddress() {
		System.out.println("Address");
	}
	public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.companyName();
		c.companyId();
		c.companyAddress();
	}

}
