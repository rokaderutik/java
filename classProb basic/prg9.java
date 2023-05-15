//c2w1 c2w2 c2w3
//c2w1 c2w2 c2w3
//c2w1 c2w2 c2w3

class c2w{
	public static void main(String[] s){
		int row = 3, col = 3;
		for(int i=1,j=1; i<=row*col; i++){
			
			System.out.print("C2W"+(j++)+" ");
			
			if(i%col == 0){
				System.out.println();
				j=1;
			}
		}
	}
}
