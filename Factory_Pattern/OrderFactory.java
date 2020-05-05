package com.fianl.factory;

public class OrderFactory {
	
	public Order buildOrder(ProductType productType , Channel channel) {
		if(productType.toString().equalsIgnoreCase("ELECTRONIC")) {
			return new ElectronicOrder(channel);
		}
		if(productType.toString().equalsIgnoreCase("FURNITURE")) {
			return new FurnitureOrder(channel);
		}
		if(productType.toString().equalsIgnoreCase("TOYS")) {
			return new ToysOrder(channel);
		}
		return null;
	}

}
