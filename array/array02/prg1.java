//sum of all elements

import java.io.*;

class c1{
	public static void main(String [] Arg)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array size:");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter array elements");

		for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int sum = 0;
		for(int i=0; i<arr.length; i++){
             
			sum += arr[i];
                }

		System.out.println("Sum of array elements = " + sum);

	}
}
