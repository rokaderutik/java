class Program8 {
    public static void main(String[] args) {
        int day = 7;
        if(day<0){
            System.out.println("Invalid input");
        }
        else if(day == 0){ 
            System.out.println("0 days assignment is over due");
        }
        else{
            while(day!=0){
                System.out.println(day + " days remaining");
                day--;
            }
            System.out.println("0 days assignment is over due");
        }
    }    
}
