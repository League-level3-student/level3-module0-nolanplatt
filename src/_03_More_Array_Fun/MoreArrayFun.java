package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] arrayString = new String[13];
		arrayString[0] = "0";
		arrayString[1] = "1";
		arrayString[2] = "2";
		arrayString[3] = "3";
		arrayString[4] = "4";
		arrayString[5] = "5";
		arrayString[6] = "6";
		arrayString[7] = "7";
		arrayString[8] = "8";
		arrayString[9] = "10";
		arrayString[10] = "11";
		arrayString[12] = "13";





		printRandomOrderArrayStrings(arrayString);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void printArrayStrings(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void printReverseArrayStrings(String[] array) {
		for(int counter=array.length - 1; counter >= 0;counter--) {
			System.out.println(array[counter]);
		}
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	
	static void printEveryOtherArrayStrings(String[] array) {
	for (int i = 0 ; i < array.length; i+=2){
        System.out.print(array[i] + "\n") ;
    }
	}
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void printRandomOrderArrayStrings(String[] array) {
		Random r = new Random();
		int val = r.nextInt(5);
		for (int i = 0 ; i < array.length; i+=val){
	        System.out.print(array[i] + "\n") ;
	    }
	}
	
}
