package com.fianl.observer;

import java.util.ArrayList;

public class Admin implements NotificationService {

	private ArrayList<Event> events;

	public ArrayList<Event> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<Event> events) {
		this.events = events;
	}

	public Admin() {
		this.events = new ArrayList<Event>();
	}

	@Override
	public void subscribeEvent(Event event) {
		// TODO Auto-generated method stub
		this.events.add(event);
		this.notification();

	}

	@Override
	public void unsubscribeEvent(Event event) {
		// TODO Auto-generated method stub
		this.events.remove(event);
		this.notification();

	}

	@Override
	public void notification() {
		// TODO Auto-generated method stub
		for (Event e : events) {
			if (e.ticketsSold() >= 100) {
				System.out.println(Event.msg);
			}
		}

	}

}
