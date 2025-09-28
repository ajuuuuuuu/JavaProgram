class ArrayADTImpl implements ArrayADT{

    private int[] arr;
    private int index;
    private int size;


    public ArrayADTImpl(int size){
        this.size=size;
        this.arr=new int [size];
        this.index=0;
    }

    public void insert(int val){
        if(index>=size-1){
            System.out.println("array is full");
            return;
        }
        arr[index]=val;
        index++;
        System.out.println("index value is "+index);
    }

    public void delete(int deleteIndex){
        if(deleteIndex < 0 || deleteIndex >= index){
            System.out.println("array index is less than 0 or index value is more than current size");
            return;
        }
        for(int i = deleteIndex; i < index - 1; i++){
            arr[i] = arr[i + 1];
        }
        index--;
    }

    public int  search(int val){
        int indexRes=-1;
        for(int i=0;i<index;i++){
            if(arr[i]==val){
                indexRes=i;
                break;
            }
            

        }
        return indexRes;
    }


    public int get(int getIndex){
        if(getIndex<0|| getIndex>this.index){
            System.out.println("array index is less then 0 or index value is more then size");
            return -1;
        }
        return arr[getIndex];
    }


public void traverse(){
    for(int i=0;i<this.index;i++){
        System.out.println(arr[i]);
    }
    System.out.println();

}
@Override
public void update(int updateindex,int val){
    if(updateindex<0|| updateindex>this.index){
        System.out.println("array index is less then 0 or index value is more then size");
        return;
    }
    arr[updateindex]=val;
}


public int getSizse(){
    return this.index;
}


}