package com.ajay.FactoryMethodDesignPattern;

public class Main {
	public static void main(String[] args) {
		Delivery delivery=DeliveryFactory.getDelivery("bike");
		delivery.delivery();
	}
}
