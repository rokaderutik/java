//common elements in 2 arrays

import java.io.*;

class c1{
	public static void main(String [] Arg)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 1st array size:");
		int size = Integer.parseInt(br.readLine());

		int arr1[] = new int[size];

		System.out.println("Enter 1st array elements");

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

		System.out.println("Common elements");
		for(int i=0; i<arr1.length; i++){
                        
			for(int j=0; j<arr2.length; j++){
				if(arr1[i] == arr2[j]){
					System.out.println(arr1[i]);
					break;
				}
			}
                }

	}
}
