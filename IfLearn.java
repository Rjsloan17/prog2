package finalexam;
import java.util.Scanner;


public class IfLearn 

{
public static void main(String args[]) 
{
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    double num = input.nextDouble();
    
        if (num > 0 && num % 2 == 0)
            {
            System.out.println("Positive Even Number");
            }   
        else if (num > 0 && num % 2 == 1 )
            {
            System.out.println("Positive Odd Number");
            }
        else if (num == 0)
            {
            System.out.println("Zero");
            }
        else
        {
            System.out.println("Negative");
        }
      
}
}
