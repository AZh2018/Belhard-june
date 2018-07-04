

public class HomeTask1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sec = 4_500;
		// A
		int min = sec/60;
		int secRest = sec%60;
		
		System.out.println(sec + " seconds is: " + min + " full minutes and " + secRest 
					+ " seconds.");
		System.out.println("OR");
		
		// B
		int hour = sec/3600;
		secRest = sec%3600; 
		min = secRest/60;
		secRest = secRest%60;
		
		
		System.out.println(sec + " seconds is " + hour + " full hours and " + min
				+ " full minutes and " + secRest + " seconds.");
		System.out.println("OR");
		
		//C
		int day = 3600*24;
		int days = sec/day;
		secRest = sec%day;
		hour = secRest/3600;
		secRest = secRest%3600;
		min = secRest/60;
		secRest = secRest%60;
		
		System.out.println(sec + " seconds is " + days + " full days "  + hour + 
				" full hours and " + min + " full minutes and " + secRest + " seconds.");
		System.out.println("OR");
		
		//D
		int week = 7*day;
		int weeks = sec/week;
		secRest = sec%week;
		days = secRest/day;
		secRest = sec%day;
		hour = secRest/3600;
		secRest = secRest%3600;
		min = secRest/60;
		secRest = secRest%60;
		
		System.out.println(sec + " seconds is " + weeks + " full weeks " + days + " full days "  + hour + 
				" full hours and " + min + " full minutes and " + secRest + " seconds.");
		System.out.println("OR");
		
				
	}	

}
