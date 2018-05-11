import java.util.Scanner;
public class DrawPyramid {

    public static void main(String[] args) {
        System.out.println("Pls enter the level of pyramid!");
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();
        String line="*";
        for (int i = 1; i < level+1 ; i++) {
            for (int j = 0; j <level-i; j++) {
                System.out.print(" ");
            }
            System.out.println(line);
            line=line+"**";
        }

        // Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
    }
}