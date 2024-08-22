abstract class Vehicle {
    public abstract void ride();
}
class Car extends Vehicle {
    @Override
    public void ride() {
        System.out.println("Riding a car!");
    }
}
abstract class VehicleFactory {
    public abstract Vehicle createVehicle();
}
class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
