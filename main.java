// Practicum 8 (Even or Odd Program)
// (TO COMPLETE)

// This program will prompt the user for an integer value
// and display whether it is even or odd.

// REQUIRED OUTPUT:
// The program MUST display the results exactly as shown below:
// <n> is odd
// <n> is even
// --------------------------------------------------------------
import java.util.*;
public class main {
  public static void main(String[] args) {
    System.out.println("\nPRACTICUM 10\n");
    System.out.println(
         "Will determine if a given number odd or even.\n");
      
    // declare input Scanner 
    Scanner input = new Scanner(System.in);

    // get input
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    
    // init to false
    boolean odd;

    // number is divisible by 2?
    if (number % 2 == 0) 
      odd = false;
      
      else
      odd = true;

    if(odd)
      System.out.println(number + " is odd.");
    else
      System.out.println(number + " is even.");
  }
}

