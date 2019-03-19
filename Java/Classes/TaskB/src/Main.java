import autoPark.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {

    List<Car> carPark = new CarBuilder().initCarPark();
    double poolPrice = 0.0;
    for (Car car : carPark) {
      poolPrice += car.getPrice();
    }
    System.out.println("Стоимость всех авто в парке: " + poolPrice);

    carPark.sort((car1, car2) -> ((int) Math.round(100.0 * (car1.getFuelConsumption() - car2.getFuelConsumption()))));

    for (Car car : carPark) {
      System.out.printf("Список авто с отсортированным расходом %s: %s", car, car.getFuelConsumption());

      System.out.println();
    }

    System.out.println("Диапазон скоростей: укажите минимальную: ");
    double minSpeed = getSpeed();
    System.out.println("Диапазон скоростей: укажите максимальную: ");
    double maxSpeed = getSpeed();
    for (Car car : carPark) {
      if (car.getMaxSpeed() >= minSpeed && car.getMaxSpeed() <= maxSpeed) {
        System.out.printf("Авто в указанном диапазоне скоростей %s: %s", car, car.getMaxSpeed());
        System.out.println();
      }
    }
  }

  private static double getSpeed() throws IOException {
    double currentSpeed;

    while (true) {
      try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        currentSpeed = Double.parseDouble(reader.readLine());
        break;
      } catch (NumberFormatException e) {
        System.out.println("Вы указали не число");
      }
    }
    return currentSpeed;
  }
}