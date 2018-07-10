import java.util.Random;
public class HomeTask2_4 {

	public static void main(String[] args) {
		
		int[] marks;
		marks = new int[40]; 
		
		Random random = new Random();
				
		for (int i = 0; i<marks.length; i++) {
					
			marks[i] = random.nextInt(10)+1;
			System.out.println (i + ":" + marks[i]);
		
		}
		
		System.out.println ("first mark: " + marks[0]);
		System.out.println ("last mark: " + marks[marks.length-1]);
		
		int max;
		max = 0;
		
		for (int i = 1; i<marks.length; i++) {
			if (marks[max] < marks[i]) {
				max = i;
			}
		}
		System.out.println ("index of the max mark: " + max);
		System.out.println ("max mark: " + marks[max]);
	}
}
