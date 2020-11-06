package algo;

public class Ratespiel {
	
	public static void computerRaten(int arg) {
		int counter = 0;
		while (true) {
			counter++;
			int rateZahl=(int) (Math.random()*100)+1;
			
			if( rateZahl==arg) {
				System.out.println("Ihre zahl ist :"+rateZahl);
				System.out.println(counter);
				break;
			}
		}
	}
	
	public static void main (String[] args) {
		int zahl = Integer.parseInt(args[0]);
		computerRaten(zahl);
		System.out.println("this is to git");
	}
}
