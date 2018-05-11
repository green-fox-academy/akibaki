import java.util.Scanner;
public class MilesToKmConverter {
    // Loads the scanner to the file

        public static void main(String[] args) {
            // Creates a scanner
            Scanner scanner = new Scanner(System.in);

            // The program stops and waits for user input and to press enter
            System.out.println("Pls press enter to start!");
            String userInput1 = scanner.nextLine();
        // Write a program that asks for an integer that is a distance in kilometers,
            System.out.println("Pls enter the distance in kilometres! I`m gonna return it in miles.");
            int userInput2 = scanner.nextInt();
        // then it converts that value to miles and prints it
            System.out.println(userInput2/1.60934);
    }
}
