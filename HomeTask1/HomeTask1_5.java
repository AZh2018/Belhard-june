import java.util.Random;
public class HomeTask1_5 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int x = random.nextInt(9000)+1000;
		System.out.println ("Our number is: " + x); 
		
		int x1 = x%10;
		int x2 = (x/10)%10;
		int x3 = (x/100)%10;
		int x4 = (x/1000)%10;
		
		System.out.println ("Reversed number is: " + x1 + x2 + x3 + x4);
		
		

	}

}
