import java.util.Arrays;

public class Matrix {
  public static void main(String[] args) {
    // - Create (dynamically) a two dimensional array

    int[][] matrix=new int[4][4];
    int number=0;

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j <4; j++) {
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
