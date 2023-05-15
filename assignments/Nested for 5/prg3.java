import java.io.*;

class pattern{

	public static void main(String[] arg)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no. of rows");
		int row = Integer.parseInt(br.readLine());

		int n = row;
		for(int i=1; i<=row; i++){
			
			int x = i*n;
			for(int j=1; j<=row+1-i; j++){
				
				System.out.print(x + " ");
				x = x-i;
			}
			n--;
			System.out.println();
		}
	}
}
