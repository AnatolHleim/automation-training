import autoPark.Car;
import autoPark.miniBus.AutoZakCar;
import autoPark.miniBus.RouteTaxiCar;
import autoPark.miniBus.cars.HatchbackCar;
import autoPark.miniBus.cars.SedanCar;
import autoPark.miniBus.cars.UniversalCar;

import java.util.Arrays;
import java.util.List;

class CarBuilder {
  List<Car> initCarPark() {
    List<Car> park = Arrays.asList(
            new RouteTaxiCar("Mercedes", "Vito", "1000A", 9.5, 160, 22),
            new RouteTaxiCar("Ford", "Transit", "1001A", 10.0, 155, 18),
            new RouteTaxiCar("Mercedes", "ML212", "1010A", 9.0, 180, 20),
            new AutoZakCar("KamAZ", "4308", "1100A", 12.0, 100, 31),
            new HatchbackCar("Toyota", "Pius30", "1000B", 5.4, 190),
            new HatchbackCar("Audi", "80", "1001B", 7.0, 170),
            new UniversalCar("VW", "Passat", "1010B", 7.0, 170, 7),
            new SedanCar("Renalt", "Clio", "1100B", 6.0, 170)

    );
    for (Car currentCar : park
            )
      if (currentCar instanceof RouteTaxiCar) {
        currentCar.setPrice(30000 + ((currentCar.getMaxPassengers() - 16) * 1000));
      } else if (currentCar instanceof AutoZakCar) {
        currentCar.setPrice(50000 + ((currentCar.getMaxPassengers() - 30) * 1000));
      } else if (currentCar.getMark().equals("Toyota")) {
        currentCar.setPrice(20000 + ((currentCar.getFuelConsumption() * 1000)));
      } else if (currentCar.getMaxPassengers() == 7) {
        currentCar.setPrice(10000 + ((currentCar.getMaxPassengers() * 1000)));
      } else if (currentCar.getModel().equals("Clio")) {
        currentCar.setPrice(10000);
      }
    return park;
  }
}
