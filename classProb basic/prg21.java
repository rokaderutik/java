//2. WAP to take input from user to check whether given string is palindrome string or not.

import java.io.*;

class palindromeString {

	static int myStrLength(String str) {
	
		char arr[] = str.toCharArray();
		return arr.length;
	}

	static String myStrReverse(String str) {
	
		char arr[] = str.toCharArray();

		for(int i=0, j=arr.length-1; i<j; i++, j--) {
		
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return new String(arr);
	}

	static int myStrCompare(String str1, String str2) {
	
		if(myStrLength(str1)!= myStrLength(str2)) {

			return myStrLength(str1) - myStrLength(str2);
		}

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		for(int i=0; i<arr1.length; i++) {
		
			if(arr1[i] != arr2[i]) {
			
				return arr1[i] - arr2[i];
			}
		}
		return 0;
	}

	public static void main(String[] Args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the string to check for palindrome");
		String str = br.readLine();

		String rev = myStrReverse(str);
		
		int ans = myStrCompare(str, rev);

		if(ans == 0) {
			
			System.out.println("String " + str + " is a palindrome string.");
		} else {
		
			System.out.println("String " + str + " is not a palindrome string.");

		}
	}
}
