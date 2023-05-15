//print no of days in month from month no

class monthDays{
	public static void main(String[] args){
		//int N = 4;
		int N = 14;

		if(N == 1)
			System.out.println("Jan has 31 days");
		else if(N == 2)
			System.out.println("Feb has 28 or 29 days");
		else if(N == 3)
			System.out.println("Mar has 31 days");
		else if(N == 4)
			System.out.println("Apr has 30 days");
		else if(N == 5)
			System.out.println("May has 31 days");
		else if(N == 6)
			System.out.println("Jun has 30 days");
		else if(N == 7)
                        System.out.println("Jul has 31 days");
                else if(N == 8)
                        System.out.println("Aug has 31 days");
                else if(N == 9)
                        System.out.println("Sep has 30 days");
                else if(N == 10)
                        System.out.println("Oct has 31 days");
                else if(N == 11)
                        System.out.println("Nov has 30 days");
                else if(N == 12)
                        System.out.println("Dec has 31 days");
		else
			System.out.println("Invalid Month");
	}
}
