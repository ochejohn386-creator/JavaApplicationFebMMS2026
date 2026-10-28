import java.util.Random;
public class PassWordGenerator{
	public static void main (String[] args){
		Random rand = new Random();
		
		
		String lowercase = "abcdefghijklmnopqrstuvwxyz";
		String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*";
		
		String allCharacters = lowercase + uppercase + numbers + specialCharacters;
		
		String password = "";
		
		for(int i = 1; i <= 15; i++){
			
			int index = rand.nextInt(allCharacters.lenght());
			
			char characters = allCharacters.charAt(index);
			
			password = password + characters;
			
			System.out.printf("The generated password is %s%n", password);
			
		}
	}
}