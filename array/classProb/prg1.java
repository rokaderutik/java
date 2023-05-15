class arrayDemo {
	
	int a = 10;	//global
	public static void main(String[] args) {
		
		int b = 20;
		System.out.println(a);	//error: non-static variable a cannot be referenced from a static context
		System.out.println(b);
	}
}
