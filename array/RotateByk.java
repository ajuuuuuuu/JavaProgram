public class RotateByk {
    public static void rotateArray(int[] arr, int k) {
        k=k%arr.length;
       reverse(arr,0,arr.length-1);
       reverse(arr,0,k-1);
       reverse(arr,k,arr.length-1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while(start<end){
            int t= arr[start];
            arr[start]=arr[end];
            arr[end]=t;
            start++;
            end--;

        }

        System.out.println("Array after rotating by k positions: in reverse");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        rotateArray(arr, k);

        System.out.println("Array after rotating by " + k + " positions:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}