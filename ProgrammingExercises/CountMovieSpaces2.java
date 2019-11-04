import java.util.Scanner;

public class CountMovieSpaces2 {
    public static void main(String[] args) {
        String quote;
        int numSpaces = 0;


        System.out.print("Input a movie quote: ");
        Scanner scanner = new Scanner(System.in);
        quote = scanner.nextLine();

        int stringLength = quote.length();

        for(int i = 0; i < stringLength; i++) {
            char spaces = quote.charAt(i);
            if(spaces == ' ')
                numSpaces++;
        }
        System.out.println("The number of spaces is " + numSpaces);
    }
}
