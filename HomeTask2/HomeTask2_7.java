
public class HomeTask2_7 {

	public static void main(String[] args) {
		int size = 11;
		int arr[][];
		
		arr = new int[size][size];
		
		for (int i=0; i<=(size-1)/2; i++) {
			for (int j=i; j<(size-i); j++) {
				arr[i][j] = 1;
				arr[size-1-i][j] = 1;
			}
		}
		
		for (int i=0; i<size; i++) {
			String str = "";
			for (int j=0; j<size; j++) {
				str = str + " " + arr[i][j];
			}
			System.out.println(str);
		}
	}
}
