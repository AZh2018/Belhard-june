import java.util.Random;
public class HomeTask1_4 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int x = random.nextInt(1000000);
		System.out.println ("Our number is: " + x); 
		
		if ((x%10) == 1) {
			System.out.println (x + " рубль");
		} else {
			if (((x%10) == 2) | ((x%10) == 3) | ((x%10) == 4)) {
				System.out.println (x + " рубля");
			} else {
				System.out.println (x + " рублей");
			}
		}
	}

}
