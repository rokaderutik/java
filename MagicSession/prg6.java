import java.io.*;

class check{

	public static void main(String[] arg)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter char1");
		char ch1 = (char)br.read();
		br.skip(1);
		System.out.println("Enter char2");
                char ch2 = (char)br.read();


		if(ch1 == ch2)
			System.out.print(ch1 + " and " + ch2 + " are euqal");
		else if(ch1 > ch2)
			System.out.print("difference is = " + (ch1-ch2));
		else
                        System.out.print("difference is = " + (ch2-ch1));

		System.out.println();
	}
}
