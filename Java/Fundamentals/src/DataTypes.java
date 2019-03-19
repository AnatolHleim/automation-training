import java.util.Arrays;

public class DataTypes {
  public static void main(String[] args) {

    // System.out.println(intervalInclude(5,4,6));
    int[][] res = matrix(5, 0, 99);
    //System.out.println(matrixToString(res));
    matrixSringToAverage(res, 3);
   // System.out.println(matrixToString(res));
  }


  public static boolean intervalInclude(int k, int n, int m) {
    if (k > n && k <= m) return true;// (n, m]
    else return false;
  }

  public static boolean intervalInclude2(int k, int n, int m) {
    if (k >= n && k < m) return true;// [n, m)
    else return false;
  }

  public static boolean intervalInclude3(int k, int n, int m) {
    if (k > n && k < m) return true;//(n, m)
    else return false;
  }

  public static boolean intervalInclude4(int k, int n, int m) {
    if (k >= n && k <= m) return true;//[n, m]
    else return false;
  }

  public static int[][] matrix(int size, int lowLimit, int highLimit) {
    int[][] matrix = new int[size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < matrix.length; j++) {
        matrix[i][j] = (int) (Math.random() * (highLimit - lowLimit + 1)) + lowLimit;
      }
    }
    return matrix;
  }
  public static int[][] matrixSringToAverage(int[][] data,int row) {

    int[]temp = new int[data.length];
    for (int i =0;i<data.length;i++){
      temp[i]=data[row-1][i];
    }
    Arrays.sort(temp);
    for (int i =0;i<data.length;i++){
      data[row-1][i]=temp[i];
    }
    return data;
  }
  public static String matrixToString(int[][] data) {
    int numRows = data.length;
    int numColumns = data.length;
    String output = "";
    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j < numColumns; j++) {
        output += data[i][j] + " ";
      }
      output += "\n";
    }
    return output;
  }


}
