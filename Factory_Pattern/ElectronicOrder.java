package com.fianl.factory;

public class ElectronicOrder extends Order {
	
	public ElectronicOrder(Channel channel){
		super(channel,ProductType.ELECTRONIC);
		processOrder();
	}
	
	@Override
	protected void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Electronic Toys Ordered");
	}
	

}
