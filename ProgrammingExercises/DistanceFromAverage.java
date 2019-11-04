import java.util.Arrays;
import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        double[] doubleInput = new double[20];

        System.out.println("Input 12 numbers");
        for (int i = 0; i < 20;) {
            System.out.print("Input number " + i + ": ");
            Scanner scanner = new Scanner(System.in);
            double input = scanner.nextDouble();
            if (input == 999999) {
                if (i == 0) {
                    System.out.println("Enter a number before quitting.");
                } else {
                    System.out.println("Goodbye!");
                    System.exit(1);
                }
            } else {
                doubleInput[i] = input;
                i++;
            }
        }
        System.out.println(Arrays.toString(doubleInput));
    }
}
