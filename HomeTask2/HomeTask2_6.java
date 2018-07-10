import java.util.Random;
public class HomeTask2_6 {

	public static void main(String[] args) {
		
		int[] arr;
		arr = new int [10]; 
		
		Random random = new Random();
				
		for (int i = 0; i<arr.length; i++) {
					
			arr[i] = random.nextInt(10000);
			System.out.println (i + ":" + arr[i]);
		}
		
		int max;
		max = 0;
		int min;
		min = 0;
		
		for (int i = 1; i<arr.length; i++) {
			if (arr[max] < arr[i]) {
				max = i;
			}
			if (arr[min] > arr[i]) {
				min = i;
			}
		}
		System.out.println ("index of the max arr: " + max);
		System.out.println ("index of the min arr: " + min);
		
		if (min>max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		int sum = 0;
		for (int i = min; i<=max; i++) {
			sum = sum + arr[i];
		}
		System.out.println ("sum: " + sum);
	}
}
