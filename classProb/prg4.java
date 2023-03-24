class c2w{
	public static void main(String[] s){
		int x = 10;
		{
			int x = 20;
			System.out.println(x);
		}
		{
			int x = 30;
			System.out.println(x);
		}
		System.out.println(x);	
	}
}
