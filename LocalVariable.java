public class LocalVariable2{
	public static void main(String[] args){
		checknumber();
	}
	
	public static void checknumber(){
		int x = 30;
		
		if(x == 30){
			System.out.printf("Hello %d, you are equal to 30",x);
		}
		else{
			System.out.printf("Sorry %d, you are not equal to 30",x);
		}
	}
}