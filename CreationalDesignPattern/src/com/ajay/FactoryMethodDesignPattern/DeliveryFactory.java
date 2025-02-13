package com.ajay.FactoryMethodDesignPattern;

public class DeliveryFactory {

	private static final String BIKE_DELIVERY = "BIKE";
	private static final String CAR_DELIVERY = "CAR";
	private static final String TRUCK_DELIVERY = "TRUCK";

	public static Delivery getDelivery(String delivaryType) {

		if (delivaryType == null) {
			throw new IllegalArgumentException("Delivery type cannot be null");
		}

		switch (delivaryType.toUpperCase()) {
		case BIKE_DELIVERY: {
			return new BikeDelivery();

		}
		case CAR_DELIVERY: {
			return new CarDelivery();

		}
		case TRUCK_DELIVERY: {
			return new TruckDelivery();

		}
		default:
			throw new IllegalArgumentException("We dont have such type Of : " + delivaryType.toUpperCase());
		}

	}
}
