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
		
		int sumOdd = 0;
		for(int i=0; i<arr.length; i++){
                        if(arr[i]%2 == 1)
				sumOdd += arr[i];
                }

		System.out.println("Sum of odd no.s = " + sumOdd);

	}
}