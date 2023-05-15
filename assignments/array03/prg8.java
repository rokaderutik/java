import java.util.Scanner;

class Program8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array 1: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter the elements of the array 1:");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            int temp = arr1[i];
            int expo = 0;
            while(temp!=0){
                expo++;
                temp/=10;
            } 
            temp = arr1[i];
            int power_sum = 0;
            while(temp!=0){
                int power = 1;
                int rem = temp%10;
                for(int j = 0; j < expo; j++){
                    power*=rem;
                }
                power_sum+=power;
                temp/=10;
            } 
            if(power_sum == arr1[i]){
                System.out.println("Amstrong number "+arr1[i]+" found at index "+i);
            }
        }
        sc.close();
    }
}
