//Automorphic no

class c2w{
	public static void main(String[] s){
		//int N = 5;
		//int N = 25;
		int N = 7;
		int cnt = 0;
		int temp = N;

		int square = N*N;
		
		while(temp != 0){
			cnt++;
			temp /= 10;
		}
		
		int p = 1;
		for(int i=1; i<=cnt; i++){
			p = p*10;
		}


		if(square%p == N)
			System.out.println("Automorphic No.");
		else
			System.out.println("Not Automorphic No.");
	}
}
