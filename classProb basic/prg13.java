//26 Z 25 Y
//24 X 23 W
//22 V 21 U
//20 T 19 S

class c2w{
	public static void main(String[] s){
		int row = 4, col = 4;
		char ch = 'Z';
		for(int i=1; i<=row*col; i++){
			if(i%2 == 1)
				System.out.print(ch-64 + " ");
			else
				System.out.print(ch-- + " ");

			if(i%col == 0)
				System.out.print("\n");
		}
	}
}
