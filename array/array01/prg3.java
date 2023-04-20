//product of odd index 

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
		
		int prodOdd = 1;
		for(int i=0; i<arr.length; i++){
                        if(i%2 == 1)
				prodOdd *= arr[i];
                }

		System.out.println("Product of odd index no.s = " + prodOdd);

	}
}
