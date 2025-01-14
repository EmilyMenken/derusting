import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List

List<String> listOfDays = new ArrayList<>();

    // Add 3 elements to the list (OK to do one-by-one)

listOfDays.add("Monday");
listOfDays.add("Tuesday");
listOfDays.add("Wednesday");


    // Print the element at index 1

System.out.println("The element at index 1:" + listOfDays.get(1) + "!");

    // Replace the element at index 1 with a new value

listOfDays.set(1, "Sunday");

    // (Do not insert a new value. The length of the list should not change)

   System.out.println(listOfDays);

    // Insert a new element at index 0 (the length of the list will change)

    listOfDays.add(0, "Saturday");

    System.out.println(listOfDays);

    // Check whether the list contains a certain string

    String searchString = "Monday";
    if (listOfDays.contains(searchString)) {
      System.out.println("Certain string, Monday: " + searchString +"!");
  }


    // Iterate over the list using a traditional for-loop.

    for (int i = 0; i < listOfDays.size(); i++) {
      System.out.println("Day at index " + i + ": " + listOfDays.get(i)+ "!");
    }
   
    // Print each index and value on a separate line

    for (int i = 0; i < listOfDays.size(); i++) {
    System.out.println("Index: " + i);
    System.out.println("Value: " + listOfDays.get(i)+ "!");
        }

    // Sort the list using the Collections library

        Collections.sort(listOfDays);

    // Iterate over the list using a for-each loop

    for (String forEach : listOfDays) {
      System.out.println(forEach+ "!");
    }

    // Print each value on a second line

    for (String secondLine : listOfDays) {
      System.out.println(secondLine + "!"); 
      System.out.println(); //is this what you meant by on a second line?
    }

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}