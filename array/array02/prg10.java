//addition  of digits is even

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
		
		System.out.println("Output:");
		for(int i=0; i<arr.length; i++){
                        int n = arr[i];
			int sum = 0;
			while(n != 0){
				sum += n%10;
				n /= 10;
			}
			if(sum%2 == 0)
				System.out.println(arr[i]);
		}

	}
}
