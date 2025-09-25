import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {

       System.out.print("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size=scanner.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[]=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        int sum = calculateSum(arr);
        System.out.println("The sum of the array elements is: " + sum);

    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i:array){
            sum += i;
        }
       return sum;
}}