public  class Car {
  private final int carID;
  private String markCar;
  private String modelCar;
  private String registrationNumberCar;
  private double priceCar;
  private int yearsProductionCar;
  private String colorCar;

  public void setMarkCar(String markCar) {
    this.markCar = markCar;
  }

  public void setModelCar(String modelCar) {
    this.modelCar = modelCar;
  }

  public void setRegistrationNumberCar(String registrationNumberCar) {
    this.registrationNumberCar = registrationNumberCar;
  }

  public void setPriceCar(double priceCar) {
    this.priceCar = priceCar;
  }

  public void setYearsProductionCar(int yearsProductionCar) {
    this.yearsProductionCar = yearsProductionCar;
  }

  public void setColorCar(String colorCar) {
    this.colorCar = colorCar;
  }

  public int getCarID() {
    return carID;
  }

  public String getMarkCar() {
    return markCar;
  }

  public String getModelCar() {
    return modelCar;
  }

  public String getRegistrationNumberCar() {
    return registrationNumberCar;
  }

  public double getPriceCar() {
    return priceCar;
  }

  public int getYearsProductionCar() {
    return yearsProductionCar;
  }

  @Override
  public String toString() {
    return "Car{" +
            "carID=" + carID +
            ", markCar='" + markCar + '\'' +
            ", modelCar='" + modelCar + '\'' +
            ", registrationNumberCar='" + registrationNumberCar + '\'' +
            ", priceCar=" + priceCar +
            ", yearsProductionCar=" + yearsProductionCar +
            ", colorCar='" + colorCar + '\'' +
            '}';
  }

  public String getColorCar() {
    return colorCar;
  }

  Car(int carID, String markCar, String modelCar, String registrationNumberCar, double priceCar, int yearsProductionCar, String colorCar) {

    this.carID = carID;
    this.markCar = markCar;
    this.modelCar = modelCar;
    this.registrationNumberCar = registrationNumberCar;
    this.priceCar = priceCar;
    this.yearsProductionCar = yearsProductionCar;
    this.colorCar = colorCar;
  }

  public Car(int carID, String markCar, String modelCar,int yearsProductionCar) {
    this.carID = carID;
    this.markCar = markCar;
    this.modelCar = modelCar;
    this.yearsProductionCar=yearsProductionCar;
  }
}