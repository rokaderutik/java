import java.io.*;

class add{

	public static void main(String[] arg)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no.");
		long n = Long.parseLong(br.readLine());

		long sum = 0;
		while(n != 0){
			
			long x = n%10, f = 1;
			for(long i=x; i>=1; i--){
				f=f*i;
			}
			sum += f;
			n /= 10;
		}
		System.out.println("sum = " + sum);
	}
}
