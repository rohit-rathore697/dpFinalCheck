package com.fianl.observer;

public class EventB implements Event {

	private int ticketsSold;

	public int getTicketsSold() {
		return ticketsSold;
	}

	public void setTicketsSold(int ticketsSold) {
		this.ticketsSold = ticketsSold;
	}

	public EventB(int ticketsSold) {
		super();
		this.ticketsSold = ticketsSold;
	}

	@Override
	public int ticketsSold() {
		// TODO Auto-generated method stub
		return this.ticketsSold;
	}

}
