// Converts a string to lowercase, and 
// displays the string's length
// as well as a count of letters
public class DebugSeven4
{
   public static void main(String[] args)
   {
      String aString = "Letters got nothing on me";
      int numLetters = 0;
      int stringLength = aString.length();
      System.out.println("In all lowercase, the sentence is: ");
      for(int i = 0; i < stringLength; i++)
      {
         char ch = Character.toLowerCase(aString.charAt(i));
         System.out.print(ch);
         if(Character.isLetter(ch)) {
            numLetters++;
         }
      }
      System.out.println();
      System.out.println
              ("The number of CHARACTERS in the string is " + stringLength);
      System.out.println("The number of LETTERS is " + stringLength);
   }
}