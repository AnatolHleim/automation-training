package model;

public class Person {
  private int id;

  Person(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Person{" +
            "id=" + id +
            '}';
  }
}
