/*5. WAP to print the pattern
Row =5
*
* *
* * *
* *
*
*/

import java.util.Scanner;
class pattern {

	public static void main(String[] Args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no. of rows: ");
		int row = sc.nextInt();

		for(int i=1; i<=row; i++) {
		
			if(i<=(row+1)/2) {
			
				for(int j=1; j<=i; j++) {
				
					System.out.print("* ");
				}
			} else {
			
				for(int j=1; j<=row+1-i; j++) {

                                        System.out.print("* ");
                                }
			}
			System.out.println();
		}
	}
}
