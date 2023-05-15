import java.util.Scanner;

class Program3{
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
            int j = 2;
            for (; j*j <= arr1[i]; j++) {
                if(arr1[i]%j == 0){
                    System.out.println("Composite number "+arr1[i]+" found at index "+i);
                    break;
                }       
            }
        }

        sc.close();
    }
}
