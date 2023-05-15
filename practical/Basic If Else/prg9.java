//check pythagorous triplet

class pythaTriplet{
	public static void main(String[] args){
		//int a = 3, b = 4, c = 5;
		//int a = 1, b = 6, c = 9;
		//int a = 2, b = 2, c = 2;
		int a = 4, b = 5, c = 3;

		if((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a))
			System.out.println("It is pythagorous triplet");
		else
			System.out.println("Not pythagorous triplet");
	}
}
