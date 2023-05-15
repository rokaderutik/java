/*3.WAP to take 2 input  strings from user and check whether they are Anagram strings or not
(   string with exactly the same length quantity of each character in it, in any order ) 
Ex - ashish & shashi

listen & silent
*/

import java.io.*;

class anagram {

	public static void main(String[] Args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter string1: ");
		String str1 = br.readLine();

		System.out.print("Enter string2: ");
                String str2 = br.readLine();

		boolean ans = checkAnagram(str1, str2);
		
		if(ans == true) {
		
			System.out.print(str1 + " and " + str2 + " are anagram strings.");
		} else {
		
			System.out.print(str1 + " and " + str2 + " are not anagram strings.");

		}

		System.out.println();
	}

	static int myStrLength(String str) {

                char arr[] = str.toCharArray();
                return arr.length;
        }

	static boolean checkAnagram(String str1, String str2) {
	
		if(myStrLength(str1) != myStrLength(str2)) {

                        return false;
                }

                char arr1[] = str1.toCharArray();
                char arr2[] = str2.toCharArray();
		
		int cntArr1[] = new int[26];
		int cntArr2[] = new int[26];


		for(int i=0; i<arr1.length; i++) {
		
			if(arr1[i]>=65 && arr1[i]<=90) {
			
				cntArr1[arr1[i]-65]++;
			} else {
			
				cntArr1[arr1[i]-97]++;
			} 

			if(arr2[i]>=65 && arr2[i]<=90) {

                                cntArr2[arr2[i]-65]++;
                        } else {

                                cntArr2[arr2[i]-97]++;
                        }
		}

		for(int i=0; i<26; i++) {
		
			if(cntArr1[i] != cntArr2[i]) {
			
				return false;
			}
		}

		return true;
	}
}
