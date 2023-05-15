class Program9 {
    public static void main(String[] args) {
        int n = 7326;
        if(n<0){
            System.out.println("Invalid input");
        }
        else if(n == 0){ 
            System.out.println(0);
        }
        else{
            int rev = 0;
            while (n!=0) {
                rev = rev*10+n%10;
                n/=10;
            }
            System.out.println(rev);
        }
    }    
}
