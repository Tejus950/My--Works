package apjfsa;
import java.util.Scanner;
//ATM application to break the loop whenever daily limit exceeds for Withdrawal
public class AtmApplication 
{
	      public static void main(String[] args)
	    {
	        int dailyLimit = 500;      // Set the daily withdrawal limit
	        int totalWithdrawn = 0;    // Initialize total withdrawn amount

	        Scanner scanner = new Scanner(System.in);

	         while (true)
	        {              // Keep looping until user exits
	            System.out.println("Enter amount to withdraw (or 0 to exit):");
	            int amount = scanner.nextInt(); // Read user input

	            if (amount == 0) 
	            {
	                System.out.println("Exiting...");
	                break;     // Exit the loop if user enters 0
	            }

	            // Check if withdrawal amount exceeds daily limit
	            if (amount > dailyLimit) 
	            {
	                System.out.println("Daily withdrawal limit exceeded!");
	                continue; // Skip to next iteration of loop
	            }

	            // Check if total withdrawal amount exceeds daily limit
	            if (totalWithdrawn + amount > dailyLimit)
	            {
	                System.out.println("Withdrawal amount exceeds daily limit!");
	                break; // Exit the loop if total exceeds daily limit
	            }

	            // Update total withdrawn amount and inform user
	            totalWithdrawn += amount;
	            System.out.println("Amount withdrawn: " + amount);
	            System.out.println("Total withdrawn today: " + totalWithdrawn);
	        }

	        scanner.close(); // Close scanner to release resources
	    }
}


