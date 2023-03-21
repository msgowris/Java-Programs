package string_programs;

import java.util.Scanner;
//java program to find whether a string is palindrome or not
public class Palindrome_String {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String orginial_string = s.next();
		String reverse_string = "";

		int string_length = orginial_string.length();

		for (int i = string_length - 1; i >= 0; i--) {
			reverse_string = reverse_string + orginial_string.charAt(i);
		}
		if (orginial_string.equals(reverse_string)) {
			System.out.println(orginial_string + " " + "is palindrome string");
		} else {
			System.out.println(orginial_string + " " + "is not palindrome string");
		}

	}

}
