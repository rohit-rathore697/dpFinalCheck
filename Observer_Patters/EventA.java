package com.fianl.observer;

public class EventA implements Event {
	private int ticketsSold;

	public EventA(int ticketsSold) {
		super();
		this.ticketsSold = ticketsSold;
	}

	public int getTicketsSold() {
		return ticketsSold;
	}

	public void setTicketsSold(int ticketsSold) {
		this.ticketsSold = ticketsSold;
	}

	@Override
	public int ticketsSold() {
		// TODO Auto-generated method stub
		return this.ticketsSold;
	}

}
