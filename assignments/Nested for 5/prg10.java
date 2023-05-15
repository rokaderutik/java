import java.io.*;

class prime{

	public static void main(String[] arg)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter start");
		int start = Integer.parseInt(br.readLine());
		System.out.println("Enter end");
                int end = Integer.parseInt(br.readLine());


		for(int i=start; i<=end; i++){
			
			boolean flag = true;
			for(int j=2; j*j<=i; j++){
				
				if(i%j == 0){
					flag = false;
					break;
				}
			}
			if(flag == true)
				System.out.println(i);
		}
	}
}
