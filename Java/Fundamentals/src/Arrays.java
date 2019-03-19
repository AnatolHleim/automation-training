import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Arrays {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter size matrix");
    int sizeMatrix = scanner.nextInt();
    System.out.println("Enter low limit");
    int lowLimitMatrixNumber = scanner.nextInt();
    System.out.println("Enter high limit");
    int highLimitMatrixNumber = scanner.nextInt();
    int[][] matrix = matrixInit(sizeMatrix, lowLimitMatrixNumber, highLimitMatrixNumber);
    System.out.println("Enter string matrix for sort in average");
    System.out.println(matrixToString(sortMatrixStringToAverage(matrix, scanner.nextInt())));
    System.out.println("Enter number position for left shift matrix");
    System.out.println(matrixToString(shiftLeftMatrix(matrix,scanner.nextInt())));
  }

  private static int[][] matrixInit(int size, int lowLimit, int highLimit) {
    int[][] matrix = new int[size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < matrix.length; j++) {
        matrix[i][j] = (new Random().nextInt(highLimit - lowLimit) + 1) + lowLimit;
      }
    }
    return matrix;
  }

  private static int[][] sortMatrixStringToAverage(int[][] data, int row) {

    int[] temp = new int[data.length];
    System.arraycopy(data[row - 1], 0, temp, 0, data.length);
    java.util.Arrays.sort(temp);
    IntStream.range(0, data.length).forEach(i -> data[row - 1][i] = temp[i]);
    return data;
  }

  private static StringBuilder matrixToString(int[][] data) {
    int numColumns = data.length;
    StringBuilder str = new StringBuilder();
    for (int[] aData : data) {
      for (int j = 0; j < numColumns; j++) {
        str.append(aData[j] + " ");
      }
      str.append("\n");
    }
    return str;
  }
  private static int[][] shiftLeftMatrix(int[][] matrix, int steps) {
    for (int i=0; i<matrix.length; i++) {
      int realSteps = steps % matrix[i].length;
      while(realSteps-- > 0) {
        int temp = matrix[i][0];
        for (int j=matrix[i].length-1; j>=0; j--) {
          int val = matrix[i][j];
          matrix[i][j] = temp;
          temp = val;
        }
      }
    }
    return matrix;
  }
}
