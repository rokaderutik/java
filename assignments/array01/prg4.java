//take 7 characters print only vowels

import java.io.*;

class c1{
	public static void main(String [] Arg)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array size:");
		int size = Integer.parseInt(br.readLine());

		char arr[] = new char[size];

		System.out.println("Enter array elements");

		for(int i=0; i<arr.length; i++){
			arr[i] = (char)br.read();
			br.skip(1);
		}

		System.out.println();
		for(int i=0; i<arr.length; i++){
                        if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' ||
				arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U')
				System.out.println(arr[i]);
                }

	}
}
