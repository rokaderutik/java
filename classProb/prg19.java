

class c2w{
	public static void main(String[] s){
		int row= 3, col = 3;
		for(int i=1; i<=row*col; i++){
			System.out.print(i*i+" ");
			
			if(i%col == 0)
				System.out.println();
		}
	}
}
