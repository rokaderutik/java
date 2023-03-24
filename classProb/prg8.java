class c2w{
	public static void main(String[] s){
		//int N = 153;
		int N = 123;
		//int N = 6;
		int cnt = 0, sum = 0;
		int temp = N;
		
		for(int i=1; i<=50; i++){
			if((i%3==0 && i%5==0) || (i%4==0)){
				continue;
			}
			System.out.println(i);
		}
	}
}
