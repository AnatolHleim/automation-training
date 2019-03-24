package runner;

import controller.ControllerOperation;
import model.ArrayInit;
import model.LinkedInit;
import model.Person;

import java.util.List;

public class Main {

  private static final int COUNT = 10000;

  public static void main(String[] args) {
    List<Person> arrayList = new ArrayInit().arrayInit(COUNT);
    List<Person> linkedList = new LinkedInit().linkedInit(COUNT);

    Long startTimeArrayList = System.nanoTime();
    ControllerOperation.operationToRemoveEveryTwo(arrayList);
    Long endTimeArrayList = System.nanoTime();
    System.out.printf("Array: %d, ns", endTimeArrayList - startTimeArrayList);
    System.out.println("\n" + arrayList);
    Long startTimeLinkedList = System.nanoTime();
    ControllerOperation.operationToRemoveEveryTwo(linkedList);
    Long endTimeLinkedList = System.nanoTime();
    System.out.printf("Linked: %d, ns", endTimeLinkedList - startTimeLinkedList);
    System.out.println("\n" + linkedList);


  }

}
