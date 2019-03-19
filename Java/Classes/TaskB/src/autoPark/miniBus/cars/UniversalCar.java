package autoPark.miniBus.cars;

import autoPark.Car;

public class UniversalCar extends Car {

  public UniversalCar(String mark, String model, String carID, double fuelConsumption, double maxSpeed, int maxPassengers) {
    this.mark = mark;
    this.model = model;
    this.carID = carID;
    this.fuelConsumption = fuelConsumption;
    this.maxSpeed = maxSpeed;
    this.maxPassengers = maxPassengers;
    this.doors = 5;
  }
}