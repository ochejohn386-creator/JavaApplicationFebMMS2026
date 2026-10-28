import java.util.Random;
public class StudentID{
	public static void main(String[] args){
		Random rand = new Random();
		
		int num = rand.nextInt (1000);
		String studentID = String.format("STU%04d", num);
		
		System.out.println("StudentID: " + studentID);
		
	}
}