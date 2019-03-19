package client;
import callCenter.CallCenter;
import operator.Operator;

public class Client implements Runnable {

  private final static int WAITING_TIME = 1000;
  private int id;
  private CallCenter callCenter;

  public int getId() {
    return id;
  }

  public Client(CallCenter callCenter, int id) {
    this.callCenter = callCenter;
    this.id = id;
  }

  public void run() {
    Operator operator = null;
    try {
      while (operator == null) {
        System.out.printf("Клиент %d позвонил в коллцентр\n", this.id);
        operator = callCenter.tryCall(this, WAITING_TIME);
      }
      System.out.printf("Клиент %d общается с оператором %d\n", this.id,
              operator.getId());
      operator.talk();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (operator != null) {
        System.out.printf("Клиент %d завершил звонок с оператором %d\n",
                this.id, operator.getId());
        callCenter.endCall(operator);
      }
    }
  }
}