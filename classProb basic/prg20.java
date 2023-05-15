/*1.WAP to take input from user in 2D array and skip the diagonal elements while printing the array.
Ex.  1  2  3
       4   5  6 
       7   8  9 
Output- 2,3,4,6,7,8
*/

import java.io.*;

class skipDig {
	
	public static void main(String[] Args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array dimension (row=col)");
		int dim = Integer.parseInt(br.readLine());

		int arr[][] = new int[dim][dim];

		System.out.println("Enter array elements:");

		for(int i=0; i<arr.length; i++) {
		
			for(int j=0; j<arr[i].length; j++) {
			
				System.out.print("Enter element for location " + i + ", " + j + ":  ");
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}

		//method call
		skipDigEle(arr);

		System.out.println();
	}

	static void skipDigEle(int arr[][]) {
	
		System.out.println("Array elements after skipping diagonal elements:");

                for(int i=0; i<arr.length; i++) {

                        for(int j=0; j<arr[i].length; j++) {

				if(i!=j)
                                	System.out.print(arr[i][j] + " ");
                        }
                }

	}
}
