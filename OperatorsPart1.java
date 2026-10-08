public class OperatorsPart1{
	public static void main(String [] args) {
	//Arithmetic operators(+,-,*/,%)
	int num1 = 50;
	int num2 = 200;
	
	int addition = num1 + num2;
	int subtraction = num1 - num2;
	int multiplication = num1 * num2;
	double division = (double)num1 / num2;
	int remainder = num1 % num2;
	
	
	System.out.println("-------------------Arithmetic output------------------");
	
	System.out.printf("%d + %d", num1, num2, addition);
	System.out.printf("%d - %d", num1, num2, subtraction);
	System.out.printf("%d * %d", num1, num2, multiplication);
	System.out.printf("%d / %d", num1, num2, division);
	System.out.printf("%d % %d", num1, num2, remainder);
	
	//Compound assignment operators(-=,+=,/=,*=,);
	int number1 = 20;
	int number2 = 2;
	
	System.out.println("-------------------Compound Assignment output------------------");
	number += number2;
	System.out.printf("The value of number1 has been updated to %d",number1);
	number1 -= number2;

	System.out.printf("The value of number1 has been updated to %d",number1);
	number1 *= number2;
	System.out.printf("The value of number1 has been updated to %d",number1);
	number1 %= number2;
	System.out.printf("The value of number1 has been updated to %d",number1);
	number1 /= number2;
	System.out.printf("The value of number1 has been updated to %d",number1);
	System.out.println("-------------------------------------");
	
	//Relational operators (<,>,>=,<=,==,!=)
	int x = 90;
	int y = 51;
	
	boolean isGreater = x > y;
	boolean isLessThan = x < y;
	boolean isGreaterOrEqualTo = x >= y;
	boolean isLessThanOrEqualTo = x <= y;
	boolean isNotEqualTo = x != y;
	
	
	System.out.println("--------Relational output-------------")
	System.out.printf("Is %d > %d = %b ",x,y, isGreater);
	System.out.printf("Is %d < %d = %b ",x,y, isLessThan);
	System.out.printf("Is %d >= %d = %b ",x,y, isGreaterOrEqualTo);
	System.out.printf("Is %d <= %d = %b ",x,y, isLessThanOrEqualTo);
	
	}
}
	