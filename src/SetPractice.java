import java.util.HashSet;
import java.util.Set;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set

    Set<String> flavorString = new HashSet<>();

    // Add 3 elements to the set
    // (It's OK to do it one-by-one)

    flavorString.add("Vanilla");
    flavorString.add("Strawberry");
    flavorString.add("Chocolate");

    // Check whether the Set contains a given String

    String stringToCheck = "Strawberry";

    if (flavorString.contains(stringToCheck)) {
      System.out.println("The Set does contain: " + stringToCheck);
  } else {
      System.out.println("The Set doesn't contain: " + stringToCheck);
  }

    // Remove an element from the Set

System.out.println("Before removing vanilla: "+ flavorString);

flavorString.remove("Vanilla");

System.out.println("After removing vanilla: "+flavorString);

    // Get the size of the Set

    int setSize = flavorString.size();
    System.out.println("The size of the Set is: " + setSize);

    // Iterate over the elements of the Set, printing each one on a separate line

    for (String flavors : flavorString) {
      System.out.println(flavors);
  }

    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
