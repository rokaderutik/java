class c2w{
	public static void main(String[] s){
		int x =10;
		{
			int y = 20;
			System.out.println(x + " " +y);
		}
		{
			System.out.println(x + " " +y);
		}
		System.out.println(x + " " +y);	
	}
}
