//F 5 D 3 B 1
//F 5 D 3 B 1
//F 5 D 3 B 1
//F 5 D 3 B 1
//F 5 D 3 B 1
//F 5 D 3 B 1
//F 5 D 3 B 1

class c2w{
	public static void main(String[] s){
		int row= 6, col = 6;
		char ch = 'A'+5;
		for(int i=1; i<=row*col; i++){
			if(i%2 == 1)
				System.out.print(ch +" ");
			else
				System.out.print(ch-64 + " ");
			
			ch--;
			if(i%col == 0){
				System.out.println();
				ch = 'A'+5;
			}
		}
	}
}
