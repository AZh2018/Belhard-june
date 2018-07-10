import java.util.Random;
public class HomeTask2_2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int x = random.nextInt(1000);
		System.out.println ("Our number is: " + x); 

		boolean prime = true; 
		for (int i=2; i<x; i++) {
			// System.out.println (i); 
			if (x%i == 0) {
				System.out.println (i);
				prime = false; 
			}
		}
		if (prime) {
			System.out.println ("Our number is prime");
		} else {
			System.out.println ("Our number is composite");
		}
	}

}
