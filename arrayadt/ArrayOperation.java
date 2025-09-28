public class ArrayOperation {
      public static void main(String[]args){
        ArrayADTImpl a= new ArrayADTImpl(5);
        a.insert(10);
        a.insert(20);
        a.insert(30);
        a.insert(40);
       
        a.traverse();
        System.out.println("after Traverse");
        a.delete(1);
        a.traverse();

       int serachvalue= a.search(30);

       System.out.println("search value index is "+serachvalue);
       System.out.println("");

        a.update(2,100);
        a.traverse();
        System.out.println();   

     int Size=a.getSizse();
     System.out.println("size of array is "+Size);
       System.out.println();

       a.traverse();
    }
}
