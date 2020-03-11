package org.network;

public class Wifi {
	
	public void wifiName() {
		System.out.println("Wifi");
	}
	public static void main(String[] args) {
		Wifi w=new Wifi();
		w.wifiName();
		MobileData m=new MobileData();
		m.dataName();
		Lan l=new Lan();
		l.lanName();
		Wireless W=new Wireless();
		W.modemName();
	}

}
