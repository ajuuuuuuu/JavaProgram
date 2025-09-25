import java.util.Scanner;
public class Occurance {


    public static int findOccurance(int arr[],int size) {
        int count=0;
        for (int i=0;i<size;i++){
            if(arr[i]==5){

                count++;
            }
            
            
           
        }

       
        return count;
       
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

        int result=findOccurance(arr,size);
       if(result==0){
        System.out.println("The number 5 is not present in the array.");
       }
       else{
        System.out.println("The number of occurances of 5 in the array is: "+result);
       }
    }
}