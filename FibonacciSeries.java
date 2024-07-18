package apjfsa;

import java.util.Scanner;

//Program to print the Fibonacci Series
public class FibonacciSeries
{
      //Main method
	public static void main(String[] args)
	{
		//Scanner class to read input from keyboard
         Scanner scanner= new Scanner(System.in);
         
       //Printing a statement for the user to enter the number
         System.out.println("Enter a number");
         int n= scanner.nextInt();     
         System.out.print("fibonacci series:");
         
         //Initializing the variables 
         int num1 = 0,num2 = 1;
         
         System.out.println(num1 + " " + num2 + " ");
         
         //using a loop to print fibonacci series
         for(int i = 2; i < n; i++)
         {
            int next = num1 + num2;
            System.out.println(next +"");    
            num1=num2;
            num2=next;
	     }

      }
}