package com.fianl.observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventA event1 = new EventA(141);
		EventB event2 = new EventB(200);
		Admin admin = new Admin();
		admin.subscribeEvent(event1);
		admin.subscribeEvent(event2);
		admin.notification();
		admin.unsubscribeEvent(event2);

	}

}
