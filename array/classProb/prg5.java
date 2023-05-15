import java.io.*;

class arrayDemo {
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size;
		System.out.print("Enter array size:\t");
		size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter array elements:");
		for(int i=0; i< arr.length; i++) {
	
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Array elements:");
                for(int i=0; i< arr.length; i++) {

                        System.out.println(arr[i]);
		}

	}
}
