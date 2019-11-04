import java.util.*;
public class BabyNameComparison
{
    public static void main(String[] args)
    {
        String firstName;
        String secondName;
        String thirdName;

        Scanner in = new Scanner(System.in);
        System.out.print("Input first name: ");
        firstName = in.nextLine();
        System.out.print("Input second name: ");
        secondName = in.nextLine();
        System.out.print("Input third name: ");
        thirdName = in.nextLine();

        System.out.println("The combinations are as follows:");
        System.out.println(firstName + " " + secondName);
        System.out.println(firstName + " " + thirdName);
        System.out.println(secondName + " " + firstName);
        System.out.println(secondName + " " + thirdName);
        System.out.println(thirdName + " " + firstName);
        System.out.println(thirdName + " " + secondName);
    }
}