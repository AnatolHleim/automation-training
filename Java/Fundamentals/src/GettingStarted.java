public class GettingStarted {
  public static void main(String[] args) {
    helloUserInCommandLine(args);
    reverseArgumentCommandLine(args);
    printRandomNumbers(args);
    amountAndCompositionCommandLineNumbers(args);

  }

  private static void helloUserInCommandLine(String[] args) {
    System.out.println("Hello, " + args[0] + "!");
  }

  private static void reverseArgumentCommandLine(String[] args) {
    for (int i = args.length - 1; i >= 0; i--) {
      System.out.print(args[i] + " ");
    }
  }

  private static void printRandomNumbers(String[] args) {
    for (int i = 0; i < Integer.parseInt(args[0]); i++) {
      System.out.println((int) (Math.random() * 100));
    }
    for (int i = 0; i < Integer.parseInt(args[0]); i++) {
      System.out.print((int) (Math.random() * 100) + " ");
    }
  }

  public static void amountAndCompositionCommandLineNumbers(String[] args) {
    int amount = 0;
    int multiplication = 1;
    for (String arg : args) {
      amount += Integer.parseInt(arg);
      multiplication = multiplication * Integer.parseInt(arg);
    }
    System.out.println("Amount argument=" + amount + " Composition argument=" + multiplication);
  }

}
