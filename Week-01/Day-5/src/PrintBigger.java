import java.util.Scanner;
public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        // Write a program that asks for 5 integers in a row,
        int numbers[];
        numbers = new int[2];
        System.out.println("Input 2 numbers pls!");
        for (int i = 0; i <2; i++) {
            numbers[i]=scanner.nextInt();
        }
        System.out.println("The statement, that number "+String.valueOf(numbers[0])+" is bigger than "+String.valueOf(numbers[1])+ " is: "+String.valueOf(numbers[0]>numbers[1]));
    }
// Write a program that asks for two numbers and prints the bigger one
}
