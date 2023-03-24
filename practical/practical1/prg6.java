//print Max of 3 no.

class maxOF3{
	public static void main(String[] args){
		//int N1 = 4, N2 = 6, N3 = 2;
		int N1 = 4, N2 = 4, N3 = 4;
		if(N1>N2 && N1>N3)
			System.out.println(N1+" is maximum between "+N1+","+N2+" & "+N3);
		else if(N2>N1 && N2>N3)
			System.out.println(N2+" is maximum between "+N1+","+N2+" & "+N3);
		else if(N3>N1 && N3>N2)
			System.out.println(N3+" is maximum between "+N1+","+N2+" & "+N3);
		else if(N1==N2 && N2>N3)
			System.out.println(N1+" & "+N2 +" are equal they are maximum between "+N1+","+N2+" & "+N3);	
		else if(N1==N3 && N1>N2)
			System.out.println(N1+" & "+N3 +" are equal they are maximum between "+N1+","+N2+" & "+N3);
		else if(N3==N3 && N2>N1)
			System.out.println(N2+" & "+N3 +" are equal they are maximum between "+N1+","+N2+" & "+N3);
		else
			System.out.println(N1+", "+N2+" & "+N3+" are equal");
	}
}
