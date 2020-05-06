package com.fianl.observer;

public interface NotificationService {

	public void subscribeEvent(Event event);

	public void unsubscribeEvent(Event event);

	public void notification();

}
