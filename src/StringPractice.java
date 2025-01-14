import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable

    String longWord = "Pneumonoultramicroscopicsilicovolcanoconiosis";

    // Find the length of the string

System.out.println("String length is: "+ longWord.length());

    // Concatenate (add) two strings together and reassign the result

    String helloString = "Hello";
    String comboString = helloString + longWord;
    System.out.println("The combined string is: " + comboString);

    // Find the value of the character at index 3

    char charAtIndex3 = longWord.charAt(3);
    System.out.println("Character at index 3: "+ charAtIndex3);

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)

    String substring = "volcano";
    if (longWord.contains(substring)) {
      System.out.println("The word: " + substring+", is found in the word "+ longWord);
  } else {
      System.out.println("The word: " + substring+", was not found in the word "+ longWord);
  }

    // Iterate over the characters of the string, printing each one on a separate line

    for (int i = 0; i < longWord.length(); i++) {
      System.out.println(longWord.charAt(i));
    }
  
    // Create an ArrayList of Strings and assign it to a variable

  ArrayList<String> lavaList = new ArrayList<>();


    // Add multiple strings to the List (OK to do one-by-one)

    lavaList.add("lava");
    lavaList.add("crystalline");
    lavaList.add("silicosis");
    lavaList.add("volcanicDust");


    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop

    String megaComboString = String.join(" ", lavaList);
System.out.println(megaComboString);

    // Check whether two strings are equal

    if (longWord.equals(helloString)) {
      System.out.println("The strings, " +longWord+", and "+helloString+ " are equal.");
  } else {
      System.out.println("The strings, " +longWord+", and " +helloString+ " are NOT equal.");
  }

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
