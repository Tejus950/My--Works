package apjfsa;

//Program  to find out the given number is Palindrome number or not.
public class Palindrome 
{
     //Main method
	public static void main(String[] args)
	{
		//Initializing the variables 
		int r , sum=0 , temp;
		int n=25;
		temp=n;
		
		//to check the condition and to print given number is palindrome or not
		
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Palindrome number");
		else
			System.out.println("not palindrome");
		
     }

}
