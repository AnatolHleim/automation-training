package controller;

import model.Person;

import java.util.List;

public class ControllerOperation {
  private ControllerOperation() {
    throw new IllegalStateException("Utility class");
  }
  public static void operationToRemoveEveryTwo(List<Person> list) {
    while (list.size() > 1) {
      for (int i = 0; i < list.size(); i++) {
        list.remove(i);
      }
    }
  }
}
