//strong no
//145 = 1! + 4! + 5!

class c2w{
	public static void main(String[] s){
		//int N = 153;
		//int N = 123;
		int N = 2;
		for(int j=1; j<1000; j++){
		int sum = 0;
		int temp = j;
		
		while(temp != 0){
			int p = 1;
			for(int i=temp%10; i>=1; i--){
				p = p*i;
			}
			sum += p;
			temp /= 10;
		}

		if(sum == j)
			System.out.println("Strong No." + j);
		//else
		//	System.out.println("Not Strong No.");
	}}
}
