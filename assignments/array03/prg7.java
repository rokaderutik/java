import java.util.Scanner;

class Program7{
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
            int facto_sum = 0;
            while(temp!=0){
                int rem = temp%10;
                int facto = 1;
                for (int k = 2; k <= rem; k++) {
                    facto*=k;
                }
                facto_sum += facto;
                temp/=10;
            } 
            if(facto_sum == arr1[i]){
                System.out.println("Strong number "+arr1[i]+" found at index "+i);
            }
        }

        sc.close();
    }
}
