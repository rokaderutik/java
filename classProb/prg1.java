//perfect no
//sum of factors = no
class c2w{
	public static void main(String[] s){
		int N = 4;
		int sum = 0;
		
		for(int i=1; i<=N/2; i++){
			if(N%i == 0)
				sum += i;
		}
		if(sum == N)
			System.out.println("Perfect No.");
		else
			System.out.println("Not Perfect No.");
	}
}
