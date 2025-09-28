import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int arr[],int target){
            int index=-1;
            for(int i=0;i<arr.length;i++){
                 if(arr[i]==target){
                    index=i;
                    break;
                 }   
                 
            }
            return index;
            
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
            
            int elementindex= linearSearch(arr,target);
            if(elementindex==-1){
                System.out.println("element is not found ");

            }
            else{
            System.out.println("your element is find at"+elementindex+"th index");
            }
        }
    }
}
