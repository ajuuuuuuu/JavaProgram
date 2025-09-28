import java.util.Scanner;



public class MoveZeroEnd {
    public static void moveZeroToEnd(int[] arr) {
        int index=0;
       for(int i =0;i<arr.length;i++){
         if(arr[i]!=0){
           arr[index]=arr[i];
              index++;
         }
         
       } 
       while(index<arr.length){
         arr[index]=0;
         index++;
       }
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        moveZeroToEnd(arr);

        System.out.println("Array after moving zeros to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}