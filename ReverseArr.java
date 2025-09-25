import java.util.Scanner;
public class ReverseArr {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size=scanner.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[]=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }

        reverseArray(arr,size);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverseArray(int[] a,int size) {
        int s=0;
        int e=size-1;
        while(s<e){
            int temp=a[s];
            a[s]=a[e];
            a[e]= temp;
            s++;
            e--;
        }

        
  
    }
   
    }