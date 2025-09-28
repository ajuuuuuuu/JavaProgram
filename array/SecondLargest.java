import java.util.Scanner;
public class SecondLargest {
    public static void findSecondLargest(int[] arr) {
        int largest=arr[0];
        int SecondLargest=arr[1];

        for (int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                System.out.println("arr[i]>largest: " + arr[i] + ">" + largest);
                SecondLargest=largest;
              largest=arr[i];
              
            }
             else if(arr[i]>SecondLargest && arr[i]!=largest){
                System.out.println("arr[i]>SecondLargest && arr[i]<largest: " + arr[i] + ">" + SecondLargest + " && " + arr[i] + "<" + largest);
                SecondLargest=arr[i];
            }

        }
System.out.println("The second largest element is: " + SecondLargest);
System.out.println("The largest element is: " + largest);
        
    }

    public static void main(String[] args) {
          System.out.print("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size=scanner.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[]=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }

        findSecondLargest(arr);
       
    }
}