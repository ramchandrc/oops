package org.company;

public class CompanyInfo {

	public void fetchcompanyName(String name,int floornum) {
		System.out.println(name);
		System.out.println(floornum);
	}
	
	public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.fetchcompanyName("Nokia",5);
		
	}
}
