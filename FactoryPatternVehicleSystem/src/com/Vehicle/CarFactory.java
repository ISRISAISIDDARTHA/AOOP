package com.Vehicle;

public class CarFactory extends VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Car();
	}

}