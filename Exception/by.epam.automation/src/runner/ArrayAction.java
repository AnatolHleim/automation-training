package runner;

import parser.DataParser;
import reader.FileDataReader;

import java.util.Collections;


public class ArrayAction {


  private static Double getMultiplicationArrayData(String path) {
    return new DataParser().filter(new FileDataReader().readDataFromFile(path)).stream().mapToDouble(Double::doubleValue).sum();
  }

  private static Double getMinNumberToArrayData(String path) {
    return Collections.min(new DataParser().filter(new FileDataReader().readDataFromFile(path)));
  }

  private static Double getCoverageNumberToArrayData(String path) {
    return new DataParser().filter(new FileDataReader().readDataFromFile(path)).stream().mapToDouble(e -> e).average().getAsDouble();
  }


  public static void main(String[] args) {
    String path = "C:\\tasks\\Exception\\by.epam.automation\\src\\runner\\data.txt";
    System.out.printf("%.3f\n", getMultiplicationArrayData(path));
    System.out.println((getMinNumberToArrayData(path)));
    System.out.printf("%.2f", (getCoverageNumberToArrayData(path)));
  }
}
