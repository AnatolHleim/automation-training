package controller;

import callCenter.CallCenter;
import client.Client;
import operator.Operator;

import java.util.ArrayList;
import java.util.List;

public class Main {
  private final static int COUNT_OPERATORS = 3;
  private final static int COUNT_CLIENTS = 12;

  public static void main(String[] args) {
    List<Operator> operators = new ArrayList<>();
    for (int i = 1; i <= COUNT_OPERATORS; i++) {
      operators.add(new Operator(i));
    }
    CallCenter callCenter = new CallCenter(operators);
    for (int i = 1; i <= COUNT_CLIENTS; i++) {
      Thread thread = new Thread(new Client(callCenter, i));
      thread.start();
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

    }
  }

}
