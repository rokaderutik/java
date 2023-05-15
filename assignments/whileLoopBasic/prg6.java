class Program6 {
    public static void main(String[] args) {
        int n = 10;
        int even_sum = 0;
        int odd_mult = 1;
         int i = 1;
        while(i<=n){
		if(i%2==1)
            		odd_mult*=i;
           	else
			even_sum+=i;
        }
            System.out.println("Even sum = "+ even_sum);
            System.out.println("Odd mult = "+ odd_mult);
       
    }    
}
