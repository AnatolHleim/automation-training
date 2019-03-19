package autoPark.miniBus.cars;

import autoPark.Car;

public class SedanCar extends Car {

  public SedanCar(String mark, String model, String carID, double fuelConsumption, double maxSpeed) {
    this.mark = mark;
    this.model = model;
    this.carID = carID;
    this.fuelConsumption = fuelConsumption;
    this.maxSpeed = maxSpeed;
    this.maxPassengers = 5;
    this.doors = 4;
  }
}
