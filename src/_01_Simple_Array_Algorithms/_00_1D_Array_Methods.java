package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
	//1. Complete the method so that it returns the sum of all
	//   of the integers in the array being passed in
	public static int sumIntArray(int[] values) {
		int sum = 0;
		for (int i : values) { 
		    sum+=values[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
	}
	
	
	
	//2. Complete the method so that it returns the average of all
	//   of the integers in the array being passed in
	public static double averageIntArray(int[] values) {
				
		double sumAdded = 0;
		for (int i : values) { 
		    sumAdded+=values[i];
		}
		double sum = sumAdded / values.length;
		return sum;
	}
	
	
	//3. Complete the method so that it returns true if the integer
	//   array contains the value specified by the second parameter.
	//   It should otherwise return false.
	public static boolean containsIntValue(int[] array, int value) {
		boolean isFound = false;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				isFound = true;
			}
			else {
				isFound = false;
			}
		}
		if(isFound) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//4. Complete the method so that it returns the index of the,
	//   first instance that the specified value occurs in the array.
	//   If the array does not contain the specified value, it should return -1.
	public static int getIndex(int[] arr, int value) {
		if(value > arr.length || value < arr.length) {
			return -1;
		}
		else {
			return arr[value];
		}
		
		
	}
}
