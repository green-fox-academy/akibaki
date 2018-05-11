import java.util.Scanner;

public class AvarageOfInput {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        // Write a program that asks for 5 integers in a row,
        int numbers[];
        numbers = new int[10];
        int sum=0;
        System.out.println("Input 5 numbers pls!");
        for (int i = 0; i <5; i++) {
            numbers[i]=scanner.nextInt();
            sum+=numbers[i];
        }
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        System.out.println("Sum: "+String.valueOf(sum)+" Avarage: "+String.valueOf(sum/5));
        System.out.println(1<25);
    }
}
