public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable

float big = -17000;
System.out.println("The negative value is:" + big);

    // Create an int with a positive value and assign it to a variable

int small = 20;
System.out.println("The positive value is:" + small);

    // Use the modulo % operator to find the remainder when the int is divided by 3

    int divide = small % 3;
    System.out.println("The remainder when "+ small + " is divided by 3 is: " +divide+ "!");


    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.

    System.out.println("Is 20 even or odd?");
    if (small % 2 == 0) {
      System.out.println("It is even!");
  } else {
      System.out.println("It is odd!");
  }

    // Divide the number by another number using integer division
    
int large = 100;
    int math = large / small;
    System.out.println("Dividing " +large+" by " +small+ " equals: "+math+"!");


    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
