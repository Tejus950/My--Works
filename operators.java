package apjfsa;

public class operators {

	//Main method
	public static void main(String[] args) {
	
		//Declaring the variables and values
		
		int num1=25,x=10;
		int num2=15,y=12;
		
		//Operations to be perform (Formulas)
		
		int sum=num1+num2;         //To add the integers
		int difference=num1-num2;  //To Subtract the integers
		int product=num1*num2;     //To multiply the integers
		int quotient=num1/num2;    //To divide and get the Quotient value
		int remainder=num1%num2;   //To divide and get Remainder
		
		//Printing the results of operations performed above
		System.out.println("sum:"+sum);
		System.out.println("difference:"+difference);
		System.out.println("product:"+product);
		System.out.println("quotient:"+quotient);
		System.out.println("remainder:"+remainder);
		
		//Relational Operators to compare 2 values X and Y
		
		System.out.println("x>y:"+(x>y));
		System.out.println("x<y:"+(x<y));
		System.out.println("x>=:"+(x>=y));
		System.out.println("x<=:"+(x<=y));
		System.out.println("x==y:"+(x==y));
		System.out.println("x!=y"+(x!=y));
		
	}

}
