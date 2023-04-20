//search no and return index

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
		
		System.out.print("Enter element to search: ");
                int no = Integer.parseInt(br.readLine());

		boolean flag = false;

		for(int i=0; i<arr.length; i++){
                        if(arr[i] == no){
				flag = true;
				System.out.println("Element found at index: " + i);
				break;
			}
                }

		if(flag == false)
			System.out.println("Element not found");

	}
}
