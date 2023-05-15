//1C3	4B2	9A1
//16C3	25B2	36A1
//49C3	64B2	81A1

class c2w{
	public static void main(String[] s){
		int row= 3, col = 3;
		char ch = 'C';
		int x = col;
		for(int i=1; i<=row*col; i++){
			System.out.print((i*i)+""+ ch-- + x-- +"\t");
			
			if(i%col == 0){
				System.out.println();
				ch = 'C';
				x = col;
			}
		}
	}
}
