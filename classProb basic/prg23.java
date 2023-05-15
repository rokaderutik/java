//4. WAP to print square roots of numbers in given range

import java.io.*;

class squareRoot {

        public static void main(String[] Args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter start: ");
		int start = Integer.parseInt(br.readLine());

		System.out.print("Enter end: ");
                int end = Integer.parseInt(br.readLine());

		for(int i=start; i<=end; i++) {
		
			for(int j=1; j*j<=i; j++) {
			
				if(j*j == i) {
				
					System.out.print(j + " ");
				}
			}
		}
		System.out.println();
	}
}	
