package com.Vehicle;

public class VehicleManufacturing {

	public static void main(String[] args) {
		VehicleFactory bikeobj = new BikeFactory();
		bikeobj.driveVehicle();
		
		VehicleFactory truckobj = new TruckFactory();
		truckobj.driveVehicle();
		
		VehicleFactory carobj = new CarFactory();
		carobj.driveVehicle();
		

	}

}
