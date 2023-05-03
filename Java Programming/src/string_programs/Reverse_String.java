package string_programs;

import java.util.Scanner;

//java program to reverse a string without using String inbuilt function
public class Reverse_String {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String original_string = s.nextLine();
		String reverse_string = "";

		for (int i = original_string.length() - 1; i >= 0; i--) {
			reverse_string = reverse_string + original_string.charAt(i);
		}
		System.out.println("Reverse string without using string inbuilt function: " + reverse_string);

		// java program to reverse a string using String inbuilt function
		StringBuffer string_buffer = new StringBuffer("Gowri");
		string_buffer.reverse();
		System.out.println("Reverse string using stringbuffer inbuilt function: " + string_buffer);

		// java program to reverse a string using String inbuilt function
		StringBuilder string_builder = new StringBuilder("Karthick");
		string_builder.reverse();
		System.out.println("Reverse string using stringbuilder inbuilt function: " + string_builder);
	}

}
