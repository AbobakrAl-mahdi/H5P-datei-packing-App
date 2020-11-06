package algo;

public class Suchen {
	
	public static int binarySearchRekursive (int [] a, int searchvalue, int bottom, int top ) {
		if (top < bottom) 
			return top;
		int mid = bottom +((top - bottom)/2);
		if (searchvalue == a[mid])
			return mid;
		if (searchvalue < a[mid])
			return binarySearchRekursive(a, searchvalue, bottom, mid-1);
		else
			return binarySearchRekursive(a, searchvalue, mid+1, top);
	}
	
	public static int binarySearchIterative (int [] a,int searchValue) {
		int bottom =0;
		int top= a.length-1;
		while (bottom <= top) {
			int mid = bottom + ((top - bottom)/2);
			if (a[mid] > searchValue) {
				top = mid-1;
			}
			else
				bottom = mid+1;
		}
		return top;
	}
	
	public static void main(String[] args) {
		int searchValue = 4;
		int [] array = new int[15];
		for (int i = 0; i < array.length; i++) {
			array[i]=i+1;
			//System.out.println(array[i]);
		}
		
		int found =binarySearchIterative(array, searchValue);
		System.out.println("\n"+found);
		if (array[found]== searchValue)
			System.out.println("Element " + searchValue + " gefunden!");
		
		else
			System.out.println("Element "+ searchValue + " nicht gefunden!");
	}
}
