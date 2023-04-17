import java.io.*;

class pattern{

	public static void main(String[] arg)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no. of rows");
		int row = Integer.parseInt(br.readLine());

		int c = 64+row;
		for(int i=1; i<=row; i++){
			
			int x = row;
			char ch1 = (char)c;
			char ch2 = 'A';
			for(int j=1; j<=row; j++){
				
				if(i%2 == 1)
					System.out.print(ch1-- + "" + x-- + " ");
				else
					System.out.print(ch2++ + "" +  j + " ");
			}
			System.out.println();
		}
	}
}
