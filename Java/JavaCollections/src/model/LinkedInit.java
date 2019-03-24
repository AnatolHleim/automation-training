package model;

import java.util.LinkedList;
import java.util.List;

public class LinkedInit {
  public List<Person> linkedInit(int count) {
    List<Person> list = new LinkedList<>();
    for (int i = 0; i < count; i++) {
      list.add(new Person(i));
    }
    return list;
  }
}
