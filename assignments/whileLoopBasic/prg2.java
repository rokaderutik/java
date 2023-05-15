class Program2 {
    public static void main(String[] args) {
        int n = 4;
        int fact = 1;
        while (n!=1) {
            fact*=n;
            n--;
        }
        System.out.println(fact);
    }    
}
