//Amstrong no

class c2w{
	public static void main(String[] s){
		//int N = 153;
		int N = 123;
		//int N = 6;
		int cnt = 0, sum = 0;
		int temp = N;
		
		while(temp != 0){
			cnt++;
			temp /= 10;
		}
		
		temp = N;
		while(temp != 0){
			int p = 1;
			for(int i=1; i<=cnt; i++){
				p = p*(temp%10);
			}
			sum += p;
			temp /= 10;
		}

		if(sum == N)
			System.out.println("Amstrong No.");
		else
			System.out.println("Not Amstrong No.");
	}
}
