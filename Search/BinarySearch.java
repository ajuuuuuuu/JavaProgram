import java.util.Scanner;
public class BinarySearch {
    
public static int binarySearch(int arr[],int target){
    int s=0;
    int e=arr.length-1;

    while (s<=e){
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return mid;

        }
        else if(arr[mid]<target){
            s=mid+1;
        }
        else if(arr[mid]>target){
            e=mid-1;
        }
    }
    return -1;
}
    public static void main(String[] args) 
    {
        System.out.println("enter the size of array");
        try (Scanner sc = new Scanner(System.in)) {
            int size= sc.nextInt();

            System.out.println("enter the element of array");


            int arr[]=new int[size];

            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("enter the target element of array");
            int target= sc.nextInt();
            int elementindex= binarySearch(arr,target);
            if(elementindex==-1){
                System.out.println("element is not found ");

            }
            else{
            System.out.println("your element is find at"+elementindex+"th index");
            }
        }
}
}
