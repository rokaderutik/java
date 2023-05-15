import java.util.Scanner;

class Program6{
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
            int store = 0;
            while(temp!=0){
                store = store*10 + temp%10;
                temp/=10;
            }
            if(arr1[i] == store){
                System.out.println("palindrome number "+arr1[i]+" found at index "+i);
            }
        }

        sc.close();
    }
}
