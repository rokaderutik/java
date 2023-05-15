//merge 2 arrays

import java.io.*;

class c1{
	public static void main(String [] Arg)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 1st array size:");
		int size = Integer.parseInt(br.readLine());

		int arr1[] = new int[size];

		System.out.println("Enter 1st  array elements");

		for(int i=0; i<arr1.length; i++){
			arr1[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter 2nd array size:");
                size = Integer.parseInt(br.readLine());

                int arr2[] = new int[size];

                System.out.println("Enter 2nd array elements");

                for(int i=0; i<arr2.length; i++){
                        arr2[i] = Integer.parseInt(br.readLine());
                }

		int arr3[] = new int[arr1.length + arr2.length];

		System.out.println("Merge array");
		
		int len = arr1.length + arr2.length;
		for(int i=0; i<len; i++){
			if(i < arr1.length)
				arr3[i] = arr1[i];
			else
				arr3[i] = arr2[i-arr1.length];
		}

		for(int i=0; i<len; i++)
			System.out.print(arr3[i] + " ");

		System.out.println();

	}
}
