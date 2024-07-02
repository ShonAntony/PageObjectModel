package javaPrograms;

public class diamond {

	public static void main(String[] args) {

		/* Diamond */

		int n = 10;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("% ");
			}
			System.out.println("\033[0;100m");
		}

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		/* Largest Value in the given array */

		int[] arr = { 28, 3, 15, 9, 17, 4, 23, 2 };

		int val = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > val) {
				val = arr[i];
			}
		}
		System.out.println("Largest value in the Given Array is " + val);

		String string = "The best of both worlds";

		int count = 0;

		// Counts each character except space
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ')
				count++;
		}

		System.out.println("Total number of characters in a string: " + count);

		// String input = "Vinoth kumar";
		//
		// char[] ch = input.toCharArray();
		//
		// for (int i = ch.length - 1; i >= 0; i--) {
		// System.out.print(ch[i]);
		// }
		//
		// StringBuffer st = new StringBuffer("Vinoth kumar");
		// st.reverse();
		// System.out.println(st);
		//
		// StringBuilder st1 = new StringBuilder("is a good boy");
		// st1.reverse();
		// System.out.println(st1);

		/* palindrome */

		// String original, reverse = ""; // Objects of String class
		// Scanner in = new Scanner(System.in);
		// System.out.println("Enter a string/number to check if it is a palindrome");
		// original = in.nextLine();
		// for (int i = original.length() - 1; i >= 0; i--) {
		// reverse = reverse + original.charAt(i);
		// if (original.equals(reverse))
		// System.out.println("Entered string/number is a palindrome.");
		// else
		// System.out.println("Entered string/number isn't a palindrome.");
		// }

		// String str = "vinoth kumar";
		// char[] chars = str.toCharArray();
		// int count = 0;
		// for (int i = 0; i < str.length(); i++) {
		// for (int j = i + 1; j < str.length(); i++) {
		// if (chars[i] == chars[j]) {
		// System.out.println(chars[j]);
		//
		// count++;
		// break;
		// }
		//
		// }
		// }

		/*
		 * String str = "Selenium Webdriver"; StringBuffer st = new StringBuffer(str);
		 * st.reverse(); System.out.println(st);
		 */

		/*
		 * String str = "Vinothkumar"; char[] chars = str.toCharArray(); for (int i =
		 * chars.length - 1; i >= 0; i--) { System.out.println(chars[i]); }
		 */

		/* factorical */

		// int num, a = 0, b = 0, c = 1;
		// Scanner scan = new Scanner(System.in);
		// num = scan.nextInt();
		// for (int i = 0; i <= num; i++) {
		// a = b;
		// b = c;
		// c = a + b;
		// System.out.println(a + "");
		// }

		/*
		 * String str = "viinothkumar"; int cnt = 0; char[] inp = str.toCharArray();
		 * System.out.println("Duplicate Characters are:"); for (int i = 0; i <
		 * str.length(); i++) { for (int j = i + 1; j < str.length(); j++) { if (inp[i]
		 * == inp[j]) { System.out.println(inp[j]); cnt++; break; } } }
		 */

		/*
		 * String s = new String("vinoth"); s.concat("great"); System.out.println(s);
		 */

		/*
		 * StringBuffer s = new StringBuffer("Vinoth"); s.append("Great");
		 * System.out.println(s);
		 */

		/*
		 * String s1 = new String("vinoth"); String s2 = new String("kumar");
		 * System.out.println(s1 == s2); System.out.println(s1.equals(s2));
		 */

	}
}
