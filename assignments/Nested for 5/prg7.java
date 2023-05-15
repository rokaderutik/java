import java.io.*;

class pattern{

	public static void main(String[] arg)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no. of rows");
		int row = Integer.parseInt(br.readLine());

		int n = row*(row+1)/2;
		char ch =(char)(64+n);

		for(int i=1; i<=row; i++){
			
			for(int j=1; j<=i; j++){
				
				if(row%2 == 0){
					
					if(i%2 == 0)
						System.out.print(ch + "  ");
					else
						System.out.print(n + "  ");
				}else{
					if(i%2 == 1)
                                                System.out.print(ch + "  ");
                                        else
                                                System.out.print(n + "  ");

				}
				ch--;
				n--;
			}
			System.out.println();
		}
	}
}
