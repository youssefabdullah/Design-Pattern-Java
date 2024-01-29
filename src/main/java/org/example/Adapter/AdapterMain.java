package org.example.Adapter;

public class AdapterMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        playWithVehicle(vehicle);

        Vehicle bic = new BicycleAdapter(new Bicycle());
        playWithVehicle(bic);
    }

    private static void playWithVehicle(Vehicle vehicle) {
        vehicle.accelerate();
        vehicle.pushBreak();
        vehicle.soundHorn();
    }
}
