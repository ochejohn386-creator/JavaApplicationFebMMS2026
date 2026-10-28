import java.util.Scanner;
public class MethodOverloading{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("========================================");
		System.out.println("CALCULATE PERIMETER OF A SHAPE");
		System.out.println("========================================\n");
		System.out.println("Enter 1. Circle");
		System.out.println("Enter 2. Square");
		System.out.println("Enter 3. Rectangle");
		System.out.println("Enter 0. Exit");
		System.out.println("========================================\n");
		System.out.print("Enter your choice: ");
		int choice = scan.nextInt();
		
		switch (choice){
			case 1:
					System.out.print("Enter radius");
					double radius = scan.NextDouble();
					
					System.out.printf("The perimeter of Circle is %.2f%n",shape(radius));
			break;
			
			case 2:
					System.out.print("Enter Lenght of the Square");
					int radius = scan.NextInt();
					
					System.out.printf("The perimeter of Square is %.2f%n",shape(length));
			break;
			case 3:
					System.out.print("Enter Lenght and of the Rectangle");
					int radius = scan.NextInt();
					
					System.out.print("Enter breadth and of the Rectangle");
					int radius = scan.NextInt();
					
					System.out.printf("The perimeter of Rectangle is %.2f%n",shape(lengthOfRect,breadthOfRect));
			break;
			
			default:
			System.out.print("Good bye");
			
			
	}
	
	public static int shape(double r){
		double perimeter = 2*Math.PI*r;
		
		return perimeter;
	}
	public static int shape(int l){
		int perimeter = 4*l;
		
		return perimeter;
	}
	
	public static int shape(int l, int b){
		int perimeter = 2*(length+breadth);
		
		return perimeter;
	}
	
	}
	
}
	
	



