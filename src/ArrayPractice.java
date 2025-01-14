public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4

    String[] reptileArray = new String[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one

reptileArray[0] = "lizard";
reptileArray[1] = "snake";
reptileArray[2] = "crocodile";
reptileArray[3] = "turtle";

    // Get the value of the array at index 2

System.out.println("The value of index 2 is: " +reptileArray[2] + "!");

    // Get the length of the array

    int howLong = reptileArray.length;
    System.out.println("The length of this array is: " + howLong + "!");

    // Iterate over the array using a traditional for loop and print out each item

    for (int i = 0; i < reptileArray.length; i++) {
      System.out.println("Index number " + i + ": " + reptileArray[i] + "!");}

    // Iterate over the array using a for-each loop and print out each item

    for (String reptiles : reptileArray) {
      System.out.println("Reptiles in list: " + reptiles + "!");}

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
