//A b C d
//E f G h
//I j K l
//M n O p

class c2w{
	public static void main(String[] s){
		int row= 4, col = 4;
		char ch1 = 'A', ch2 = 'a';
		for(int i=1; i<=row*col; i++){
			if(i%2 == 1)
				System.out.print(ch1 +" ");
			else
				System.out.print(ch2 + " ");

			ch1++;
			ch2++;
			if(i%col == 0)
				System.out.println();
		}
	}
}
