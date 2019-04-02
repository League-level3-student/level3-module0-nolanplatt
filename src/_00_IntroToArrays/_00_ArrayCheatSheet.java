package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings

		String[] arrayOf5Strings = new String[5];
		//2. print the third element in the array

		System.out.println(arrayOf5Strings[3]);
		//3. set the third element to a different value

		arrayOf5Strings[3] = "new_value";
		//4. print the third element again
		
		System.out.println(arrayOf5Strings[3]);

		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < arrayOf5Strings.length; i++) {
			arrayOf5Strings[i] = "new_string_from_for_loop";
			
		}

		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < arrayOf5Strings.length; i++) {
			System.out.println(i);

		}
		//7. make an array of 50 integers

		//8. use a for loop to make every value of the integer array a random number

		//9. without printing the entire array, print only the smallest number on the array

		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
