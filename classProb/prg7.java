//fibbonacii series

class c2w{
	public static void main(String[] s){
		int N = 10;
		int a = 0, b = 1, c;
		
		for(int i=1; i<=N; i++){
			System.out.print(a + "  ");
			c = a+b;
			a = b;
			b = c;
		}
	}
}
