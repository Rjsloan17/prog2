package finalexam;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ComputeAverage 
{
        
   public static void main(String[] args) 
{
      Scanner input = new Scanner(System.in);
      int inputNumber;   // One of the integers input by the user.
      int sum;           // The sum of the positive integers.
      int count;         // The number of positive integers.
      double average;    // The average of the positive integers.
      
      /* Initialize the summation and counting variables. */
      
      sum = 0;
      count = 0;
      
      /* Read and process the user's input. */
      
      System.out.print("Enter your first positive integer: ");
      inputNumber = input.nextInt();
      
      while (inputNumber != 0) 
      {
         sum += inputNumber;   // Add inputNumber to running sum.
         count++;              // Count the input by adding 1 to count.
         System.out.print("Enter your next positive integer, or 0 to end: ");
         inputNumber = input.nextInt();
      }
      
      /* Display the result. */
      
      if (count == 0) {
         System.out.println("You didn't enter any data!");
      }
      else {
         average = (sum) / count;
         System.out.println();
         System.out.println("You entered " + count + " positive integers.");
         System.out.printf("Their average is %1.3f.\n", average);
      }
 
   }
}