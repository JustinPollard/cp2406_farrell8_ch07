import java.util.Scanner;

public class CarCareChoice {
    public static void main(String[] args) {
        String userInput;
        int oilPrice = 25;
        int tirePrice = 22;
        int batteryPrice = 15;
        int brakePrice = 5;

        System.out.println("Cody's Car Care Shop \n 'You break it, you buy it!'\n " +
                "- Oil Change \n- Tire rotation \n- Battery Check \n- Brake suspension");
        System.out.print("Please input your price enquiry: ");

        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextLine();

        switch (userInput) {
            case "oil change":
                System.out.println("The price of an oil change is " + oilPrice);
                break;
            case "tire rotation":
                System.out.println("The price of a tire rotation is " + tirePrice);
                break;
            case "battery check":
                System.out.println("The price of a battery check is " + batteryPrice);
                break;
            case "brake suspension":
                System.out.println("The price of a brake suspension replacement is " + brakePrice);
                break;
        }
    }
}
