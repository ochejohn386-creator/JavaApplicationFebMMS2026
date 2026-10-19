public class SkipProgram{
	public static void main(String[] args){
		for(int i = 1; 1<= 20; i++){
			if (i == 2 || i == 12 || i == 19|| i == 20){
				System.out.println("-");
				continue;
			}
			else{
				System.out.print(i);
			}

		}
	}
}