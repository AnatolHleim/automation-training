import java.util.Random;

public class Operators {
  public static void main(String[] args) {
    System.out.println(equalsMonthToNumber(new Random().nextInt(11)+1));
    System.out.println(verifyMoreOrEqualsThatMinAndLowMax(4,3,1));
    System.out.println(verifyMoreOrEqualsThatMinAndMoreOrEqualsMax(4,4,9));
    System.out.println(verifyMoreThatMinAndLowMax(1,0,2));
    System.out.println(verifyMoreThatMinAndLowOrEqualsMax(0,-1,4));
  }
  public static String equalsMonthToNumber(int month) {
    switch (month) {
      case 1:
        return "jan";
      case 2:
        return "feb";
      case 3:
        return "mar";
      case 4:
        return "apr";
      case 5:
        return "may";
      case 6:
        return "jun";
      case 7:
        return "jul";
      case 8:
        return "aug";
      case 9:
        return "sep";
      case 10:
        return "okt";
      case 11:
        return "nov";
      case 12:
        return "des";
      default:
        break;
    }
    return "this month unavailable";
  }
  public static boolean verifyMoreThatMinAndLowOrEqualsMax(int k, int n, int m) {
    // (n, m]
    return k > n && k <= m;
  }

  public static boolean verifyMoreOrEqualsThatMinAndLowMax(int k, int n, int m) {
    // [n, m)
    return k >= n && k < m;
  }

  public static boolean verifyMoreThatMinAndLowMax(int k, int n, int m) {
    //(n, m)
    return k > n && k < m;
  }

  public static boolean verifyMoreOrEqualsThatMinAndMoreOrEqualsMax(int k, int n, int m) {
    //[n, m]
    return k >= n && k <= m;
  }
}
