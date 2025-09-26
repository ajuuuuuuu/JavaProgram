import java.util.Scanner;



public class MoveZeroEnd {
    public static void moveZeroToEnd(int[] arr) {
        int index=0;
       for(int i =0;i<arr.length-1;i++){
         if(arr[i]==0){
            System.out.println("arr[i]==0(   "+ arr[i] + "   == " + i+ "  )  done");
            int temp=arr[i];
            System.out.println("temp : arr[i] (   " + temp + " : " + arr[i]+"   )  done");
            arr[i]=arr[arr.length-i-1];
            System.out.println("arr[i]:arr[arr.length-i-1]   (  " + arr[i] + " : " + arr[arr.length-i-1]+"   )  done");
            arr[arr.length-i-1]=temp;
            System.out.println("arr[arr.length-i-1]:temp   (  " + arr[arr.length-i-1] + " : " + temp+"  )  done");
              index++;
              System.out.println("index: " + index +"   done");

              System.out.println(" ");
         }
         
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