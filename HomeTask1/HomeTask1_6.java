import java.util.Random;
public class HomeTask1_6 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int x = random.nextInt(9000)+1000;
		System.out.println ("Our number is: " + x); 
		
		int x1 = x%10;
		int x2 = (x/10)%10;
		int x3 = (x/100)%10;
		int x4 = (x/1000)%10;
		
		if ( !((x1 == x2) | (x1 == x3) | (x1 == x4) | 
				(x2 == x3) | (x2 == x4) | (x3 == x4)) ) {
			System.out.println ("All digits are different");
		}



	}

}
