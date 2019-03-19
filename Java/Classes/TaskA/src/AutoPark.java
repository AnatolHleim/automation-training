import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoPark {
  private static List<Car> listCar;
  public static void main(String[] args) {
    listCar = Arrays.asList(
            new Car(1,"Toyota","Prius",2008),
            new Car(2,"Toyota","Prius","2246-hp7",18.001,2019,"metallik"),
            new Car(3,"Lexus","400h","2246-hp7",18.001,2010,"metallik"),
            new Car(4,"Toyota","Prius","8888-hp7",18.001,2007,"metallik"),
            new Car(5,"Lexus","Ct-200h","2246-hp7",18.001,2010,"metallik"),
            new Car(6,"BMW","312",2011),
            new Car(7,"VW","Passat","2246-hp7",18.001,2019,"metallik")
    );
    System.out.println("Список авто марки \"Lexus\"");
    for (Car carModel: getAllCarsThisModel("Lexus")
            ) {
      System.out.println(carModel);
    }
    System.out.println("Список авто старше 7 лет модели \"Prius\"");
    for (Car toyota: getModelCarsOlder(7)
            ) {
      System.out.println(toyota);
    }
    System.out.println("Список авто 2010 года с ценой свыше 12.000");
    for (Car cars: getCarsThisYearsWherePriceMoreThan(2010,12.000)
            ) {
      System.out.println(cars);
    }
  }
  private static List<Car> getAllCarsThisModel(String model) {
    List<Car> oneModelCars = new ArrayList<>();
    for ( Car car : listCar)
      if (car.getMarkCar().equals(model)) {
        oneModelCars.add(car);
      }
    return oneModelCars;
  }
  private static List<Car> getModelCarsOlder(int yearsMoreThan) {
    List<Car> carOlderInputYears = new ArrayList<>();

    for ( Car car : listCar)
      if (car.getModelCar().equals("Prius") && car.getYearsProductionCar() < (Year.now().getValue()-yearsMoreThan)) {
        carOlderInputYears.add(car);
      }
    return carOlderInputYears;
  }
  private static List<Car> getCarsThisYearsWherePriceMoreThan(int yearsProduction, double priceCar) {
    List<Car> carsSpecifiedYearAndMoreThanPrice = new ArrayList<>();
    for ( Car car : listCar)
      if (car.getYearsProductionCar()==yearsProduction && (car.getPriceCar()>priceCar)) {
        carsSpecifiedYearAndMoreThanPrice.add(car);
      }
    return carsSpecifiedYearAndMoreThanPrice;
  }
}
