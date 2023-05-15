//6. WAP to take input using string class and count the vowels and consonants in the given string.

import java.io.*;

class count {

	public static void main(String[] Args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter string");
		String str = br.readLine();

		char arr[] = str.toCharArray();

		int cntV = 0;

		for(int i=0; i<arr.length; i++) {
		
			if(arr[i] == 'a' ||arr[i] == 'e' ||arr[i] == 'i' ||arr[i] == 'o' ||arr[i] == 'u' ||
			   arr[i] == 'A' ||arr[i] == 'E' ||arr[i] == 'I' ||arr[i] == 'O' ||arr[i] == 'U') {
			   
			   	cntV++;
			   }
		}

		System.out.println("Vowels count: " + cntV);
		System.out.println("Consonants count: " + (arr.length - cntV));
	}
}
