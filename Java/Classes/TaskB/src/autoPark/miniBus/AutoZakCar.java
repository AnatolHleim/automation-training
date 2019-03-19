package autoPark.miniBus;

import autoPark.Car;

public class AutoZakCar extends Car {

  public AutoZakCar(String mark, String model, String carID, double fuelConsumption, double maxSpeed, int maxPassengers) {
    this.mark = mark;
    this.model = model;
    this.carID = carID;
    this.fuelConsumption = fuelConsumption;
    this.maxSpeed = maxSpeed;
    this.maxPassengers = maxPassengers;
  }

}