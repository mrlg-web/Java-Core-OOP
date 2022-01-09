import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{
	double num1;
	double num2;
	int choice;
	double result;
	
	Scanner ca = new Scanner(System.in);
	System.out.println("Enter first number: ");
	num1 = ca.nextDouble();
	
	System.out.println("Enter your option: (1 for +) (2 for -) (3 for *) (4 for /)");
	choice = ca.nextInt();
	
	System.out.println("Enter second number: ");
	num2 = ca.nextDouble();
	
	ca.close();
	

		switch (choice)
		{
		case 1:
			result = num1 + num2;
			System.out.println("The sum of " + num1 + " + " + num2 + " = " + result); 
			break;
		case 2:
			result = num1 - num2;
			System.out.println("The substraction of " + num1 + " - " + num2 + " = " + result); 
			break;
		case 3:
			result = num1 * num2;
			System.out.println("The multiplication of " + num1 + " * " + num2 + " = " + result); 
			break;
		case 4:
			result = num1 / num2;
			System.out.println("The division of " + num1 + " / " + num2 + " = " + result); 
			break;
		default:
			System.out.println("Wrong choice.");
		}

	}

}
