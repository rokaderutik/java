//find minimun no

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
		
		int mini = arr[0];
		for(int i=1; i<arr.length; i++){
                        if(arr[i] < mini)
				mini = arr[i];
                }

		System.out.println("Minimun no is  = " + mini);

	}
}
