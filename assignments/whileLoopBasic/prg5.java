class Program5 {
    public static void main(String[] args) {
        int n = 236523;
        if(n==0){
            System.out.println(0);
        }    
        else{
            while (n!=0) {
                int rem = n%10;
                if(rem%2==0){
                    System.out.println(rem*rem);
                }
                n/=10;
            }
        }
    }
}
