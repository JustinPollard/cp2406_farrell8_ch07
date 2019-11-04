import java.util.Arrays;
import java.util.Scanner;

public class TwelveInts {
    public static void main(String[] args) {
        int[] intInput = new int[12];

        System.out.println("Input 12 numbers: ");
        for (int i = 0; i < 12; i++) {
            Scanner scanner = new Scanner(System.in);
            intInput[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(intInput));
    }
}
