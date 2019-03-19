package autoPark.miniBus;

import autoPark.Car;

public class RouteTaxiCar extends Car {

  public RouteTaxiCar(String mark, String model, String carID, double fuelConsumption, double maxSpeed,int maxPassenger) {
    this.mark = mark;
    this.model = model;
    this.carID = carID;
    this.fuelConsumption = fuelConsumption;
    this.maxSpeed = maxSpeed;
    this.maxPassengers = maxPassenger;
  }
}