//1	2	9
//4	25	6
//49	8	81

class c2w{
	public static void main(String[] s){
		int row= 3, col = 3;
		for(int i=1; i<=row*col; i++){
			if(i%2 == 1)
				System.out.print(i*i+"\t");
			else
				System.out.print(i + "\t");
			
			if(i%col == 0)
				System.out.println();
		}
	}
}
