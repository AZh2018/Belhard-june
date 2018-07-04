import java.util.Random;

public class HomeTask1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int x = random.nextInt(1000);
		System.out.println ("Our number is: " + x); 
		
		if ((x < 1000) & (x > 99)) {
			System.out.println ("Our number is 3-digit");
			
		}
		
		if ((x%10) == 7) {
			System.out.println ("Last digit is 7");
		}
		
		if ((x%2) == 0) {
			System.out.println ("Our number is even");
		}
	}

}
