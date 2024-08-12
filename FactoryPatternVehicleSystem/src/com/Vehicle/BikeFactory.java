package com.Vehicle;

public class BikeFactory extends VehicleFactory{

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Bike();
	}

}
