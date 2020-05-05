package com.fianl.factory;

public class ToysOrder extends Order {

	public ToysOrder(Channel channel){
		super(channel , ProductType.TOYS);
		processOrder();
	}

	@Override
	void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Toys Ordered");
	}

}
