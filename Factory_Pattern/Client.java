package com.fianl.factory;

public class Client {
	public static void main(String[] args) {
		OrderFactory orderFactory = new OrderFactory();
		System.out.println(orderFactory.buildOrder(ProductType.ELECTRONIC, Channel.AGENT_APPLICATIONS));
		System.out.println(orderFactory.buildOrder(ProductType.FURNITURE, Channel.E_COMMERCE));
		System.out.println(orderFactory.buildOrder(ProductType.TOYS, Channel.AGENT_APPLICATIONS));
	}

}
