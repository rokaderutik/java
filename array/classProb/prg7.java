class integerChacheDemo {
	
	public static void main(String args[]) {
		
		int x = 10;
		int y = 10;
		Integer z = 10;	//Integer wrappe class

		System.out.println(System.identityHashCode(x));	//same
		System.out.println(System.identityHashCode(y)); //same
		System.out.println(System.identityHashCode(z)); //same
	}
}
