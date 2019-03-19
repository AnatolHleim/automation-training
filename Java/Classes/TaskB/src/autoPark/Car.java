package autoPark;

public abstract class Car {
  protected String carID;
  protected String mark;
  protected String model;

  protected double fuelConsumption;
  private double price;
  protected double maxSpeed;

  protected int maxPassengers;
  protected int doors;


  protected Car() {
  }

  public String getCarID() {
    return carID;
  }

  public void setCarID(String carID) {
    this.carID = carID;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getMark() {
    return mark;
  }

  public String getModel() {
    return model;
  }

  public double getFuelConsumption() {
    return fuelConsumption;
  }

  public double getMaxSpeed() {
    return maxSpeed;
  }


  public int getMaxPassengers() {
    return maxPassengers;
  }

  public int getDoors() {
    return doors;
  }

  @Override
  public String toString() {
    return String.format("%s %s %s", mark, model, carID);
  }
}

