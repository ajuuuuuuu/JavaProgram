import java.util.Scanner;
public class MissingNumber{

    public static void findMissingNumber(int [] arr){
        int counter=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==counter){

                counter++;
          
            }
            else if (arr[i]!=counter){
                System.out.println("The number:  "+(counter)+"  is missing");
                counter++;
                i--;
            }
        }

    }
    public static void main(String [] args){
        System.out.print("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size=scanner.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[]=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        findMissingNumber(arr);

    }

}