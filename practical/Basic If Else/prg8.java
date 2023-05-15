//print day from day no

class printDay{
	public static void main(String[] args){
		//int N = 4;
		//int N = 1;
		int N = -8;

		if(N == 1)
			System.out.println("Mon");
		else if(N == 2)
			System.out.println("Tues");
		else if(N == 3)
			System.out.println("Wed");
		else if(N == 4)
			System.out.println("Thur");
		else if(N == 5)
			System.out.println("Fri");
		else if(N == 6)
			System.out.println("Sat");
		else if(N == 7)
                        System.out.println("Sun");
		else
			System.out.println("Invalid Day");
	}
}
