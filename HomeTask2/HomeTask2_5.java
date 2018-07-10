import java.util.Random;
public class HomeTask2_5 {

	public static void main(String[] args) {
		
		int[] arr;
		arr = new int [10]; 
		
		Random random = new Random();
				
		for (int i = 0; i<arr.length; i++) {
					
			arr[i] = random.nextInt(10000);
			System.out.println (i + ":" + arr[i]);
		}
		int tmp;
		for (int i = 0; i<(arr.length/2); i++) {
			tmp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = tmp;
		}
		for (int i = 0; i<arr.length; i++) {
			
			System.out.println (i + ":" + arr[i]);
		}
	}

}
