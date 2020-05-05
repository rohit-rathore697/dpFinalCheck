package com.fianl.factory;

public class FurnitureOrder extends Order {
	
	public FurnitureOrder(Channel channel){
		super(channel , ProductType.FURNITURE);
		processOrder();
	}

	@Override
	void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Furniture Ordered");
	}
	
	

}
