import java.util.Scanner;
import java.lang.Math;

public class MethodDefined {

	/*public static void sayMyName() {
		String name;
		System.out.println("Please Enter your name  ");
        Scanner in = new Scanner(System.in);
      	 name = in.nextLine();
		
		System.out.println(" Your name is " + name);		
	}

// same idea but different way of doing it. To make it shorter
	public static void sayMyAge() {
		System.out.println("Please Enter your age  ");
	    Scanner in = new Scanner(System.in);
	   	System.out.println(" Your age is " + in.nextLine());		
	}
*/
	/*public static void addTwoNumbers() {
   		int num1, num2, result;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter first number ");
		num1 = Integer.parseInt(in.nextLine());

		System.out.println("Enter second number ");
		num2 = Integer.parseInt(in.nextLine());
		
		result = num1 + num2;
		System.out.println("Sum of entered numbers is = " + result);
	}

	public static void multiplyTwoNumbers() {
   		int num1, num2, result;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter first number ");
		num1 = Integer.parseInt(in.nextLine());

		System.out.println("Enter second number ");
		num2 = Integer.parseInt(in.nextLine());
		
		result = num1 * num2;
		System.out.println("Product of entered numbers is = " + result);
	}
*/

 	public static void add(int num1, int num2) {
 		int result = num1 + num2;
 		System.out.println("Your result is " + result);
 	}

 	public static void substract(int num1, int num2) {
 		int result = num1 - num2;
 		System.out.println("Your result is " + result);
 	}

 	public static void divide(int num1, int num2) {
 		float result = num1 / num2;
 		System.out.println("Your result is " + result);
 	}

 	public static void multiply(int num1,int num2) {
 		int result = num1 * num2;
 		System.out.println("Your result is " + result);
 	}

 	public static void mod(int num1,int num2) {
 		int result = num1 % num2;
 		System.out.println("Your result is " + result);
 	}
 	public static void squareRoot(double num) {
 		double result = Math.sqrt(num);
 		System.out.println("Your result is " + result);
 	}
 	public static void power(double num1, double num2) {
 		double result = Math.pow(num1,num2);
 		System.out.println("Your result is " + result);
 	}


 		 	       




	public static void main(String[] args) {
		System.out.println("*********************************************************************************");
		System.out.println("*********************************************************************************");
		System.out.println("Which function would you like to perform?");
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for substraction");
		System.out.println("Enter 3 for division");
		System.out.println("Enter 4 for multiplication");
		System.out.println("Enter 5 for modulo");
		System.out.println("Enter 6 for square Root");
		System.out.println("Enter 7 for power");
		System.out.println("************************************************************************************");
		System.out.println("************************************************************************************");



		
        Scanner in = new Scanner(System.in);
      	int number = in.nextInt();
		
		if (number == 1){
			int firstNumber, secondNumber;
			  System.out.println("Enter first number");
			  firstNumber = in.nextInt();
			  System.out.println("Enter second number");
			  secondNumber = in.nextInt();
			  add(firstNumber, secondNumber);
		}

		else if (number == 2){
			int firstNumber, secondNumber;
			  System.out.println("Enter first number");
			  firstNumber = in.nextInt();
			  System.out.println("Enter second number");
			  secondNumber = in.nextInt();
			  substract(firstNumber, secondNumber);
		}

		else if (number == 3){
			int firstNumber, secondNumber;
			  System.out.println("Enter first number");
			  firstNumber = in.nextInt();
			  System.out.println("Enter second number");
			  secondNumber = in.nextInt();
			  divide(firstNumber, secondNumber);
		}

		else if (number == 4){
			int firstNumber, secondNumber;
			  System.out.println("Enter first number");
			  firstNumber = in.nextInt();
			  System.out.println("Enter second number");
			  secondNumber = in.nextInt();
			  multiply(firstNumber, secondNumber);
		}

		else if (number == 5){
			int firstNumber, secondNumber;
			  System.out.println("Enter first number");
			  firstNumber = in.nextInt();
			  System.out.println("Enter second number");
			  secondNumber = in.nextInt();
			  mod(firstNumber, secondNumber);
		}

		else if (number == 6){
			double sqrNumber;
			  System.out.println("Enter number");
			  sqrNumber = in.nextDouble();
			  squareRoot(sqrNumber);
		}

		else if (number == 7){
			double firstNumber, secondNumber;
			  System.out.println("Enter first number");
			  firstNumber = in.nextDouble();
			  System.out.println("Enter second number");
			  secondNumber = in.nextDouble();
			  power(firstNumber, secondNumber);
		}


		// sayMyName();
		// sayMyAge();
		// addTwoNumbers();
		// multiplyTwoNumbers();
	}
}