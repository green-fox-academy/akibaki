import java.util.Arrays;

public class Matrix {
  public static void main(String[] args) {
    // - Create (dynamically) a two dimensional array
    int size=6;

    int[][] matrix=new int[size][size];
    int number=0;

    for (int i = 0; i < size; i++) {
      for (int j = 0; j <size; j++) {
        if (j==i){number=1;}
        else {number=0;};
        matrix[i][j]=number;
      }
      System.out.println(Arrays.toString(matrix[i]));
    }
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output
  }
}
