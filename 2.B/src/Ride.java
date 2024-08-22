public class Ride {
    public static void main(String[] args) {
        UserAuthentication auth = UserAuthentication.getInstance();
        auth.login("user123");

        VehicleFactory vehicleFactory = new CarFactory();
        Vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.ride();

        Payment paymentFactory = new CardFactory();
        Paymenttype paymentMethod = paymentFactory.createPaymentMethod();
        paymentMethod.pay();
        auth.logout();
    }
}
