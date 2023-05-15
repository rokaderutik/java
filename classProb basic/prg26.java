//7. WAP to take input as a string and trim the string ( try without using inbuilt method) .

import java.io.*;

class trim {

	public static void main(String[] Args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the string to trim");
		String str = br.readLine();

		char arr[] = new char[str.length()];
		
		int j=0;
		boolean initialSpaceFlag = true;

		for(int i=0; i<str.length()-1; i++) {
		
			if(initialSpaceFlag == true && str.charAt(i) == ' ') {
			
				continue;
			} else {
				
				initialSpaceFlag = false;
				
				if(str.charAt(i) != ' ') {
				
					arr[j++] = str.charAt(i);
				} else {
				
					if(arr[j-1] != ' ' && str.charAt(i+1) != ' ') {
					
						arr[j++] = str.charAt(i); 
					}
				}
			}
		}

		String str1 = new String(arr);
		System.out.println("After trim:\n" + str1);
	}
}
