import java.util.Scanner;
public class AnimalsAndLegs {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        // Write a program that asks for two integers
        System.out.println("nr of chicks:");
                int chicks = scanner.nextInt();
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        int pigs = scanner.nextInt();
        // It should print how many legs all the animals have
        System.out.println("nr of legs: "+String.valueOf(pigs*4+chicks*2));

    }
}
