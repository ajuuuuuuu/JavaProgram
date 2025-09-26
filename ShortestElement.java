import java.util.Scanner;

public class ShortestElement{

    public static boolean ShortestElement(int[]arr){
        boolean sorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                System.out.println("arr[i]<arr[i+1]: " + arr[i] + "<" + arr[i+1]);
                }
            else{
                sorted=false;
                break;
            }
        }
        return sorted;
    }

    public static void main(String[]args){
          System.out.print("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size=scanner.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[]=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
       boolean check=ShortestElement(arr);
         System.out.println(check);
    }
}