class Program10 {
    public static void main(String[] args) {
        int n = 45654;
        if(n<0){
            System.out.println("Invalid input");
        }
        else if(n == 0){ 
            System.out.println("Palindrome");
        }
        else{
            int temp = n;
            int rev = 0;
            while (temp!=0) {
                rev = rev*10 + temp%10;
                temp/=10;
            }
            if(rev==n){    
                System.out.println("Palindrome");
            }
            else{    
                System.out.println("Not Palindrome");
            }
        }
    }    
}
