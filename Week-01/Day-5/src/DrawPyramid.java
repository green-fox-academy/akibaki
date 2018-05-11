import java.util.Scanner;
public class DrawPyramid {

    public static void main(String[] args) {
        System.out.println("Pls enter the level of pyramid!");
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();
        String line="*";
        String empty="";
        for (int j = 0; j <level-1; j++) {
            empty=empty+" ";
        }
        for (int i = 1; i < level ; i++) {
            System.out.println(empty+line);
            line=line+"**";
            empty=empty.substring(1);
        }
        System.out.println(line);

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