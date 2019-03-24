package model;

import java.util.ArrayList;
import java.util.List;

public class ArrayInit {
  public List<Person> arrayInit(int count) {
    List<Person> list = new ArrayList<>();
    for (int i = 0; i < count; i++) {
      list.add(new Person(i));
    }
    return list;
  }
}
