public class CountMovieSpaces {
    public static void main(String[] args) {
        String quote = "I am Iron Man.";
        int numSpaces = 0;
        int stringLength = quote.length();

        for(int i = 0; i < stringLength; i++) {
            char spaces = quote.charAt(i);
            if(spaces == ' ')
                numSpaces++;
        }
        System.out.println("The number of spaces is " + numSpaces);
    }
}