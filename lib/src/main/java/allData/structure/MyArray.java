package allData.structure;

public class MyArray {
    int[] items;
    int count;

    public MyArray(int length) {
        items = new int[length];
    }

    public boolean isEmpty(){
        return count ==0;
    }

    public void print(){
        System.out.print("[");
        for (int i=0; i<count; i++){
            System.out.print(items[i]);
            if( i < count-1){
                System.out.print(",");
            }
        }
        System.out.println("]\n");
    }

    public void insert(int item){
        if(items.length == count){
            int[] newItems = new int[count*2];
            for(int i = 0; i< count; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count] = item;
        count++;
    }

    public void removeAt(int index){
        if(index<0 || index >= count){
            System.out.println("Out of range");
        }else {
            for (int i = index; i < count; i++) {
                items[i] = items[i + 1];
            }
            count--;
        }
    }

    public int atIndex(int item){

        for (int i =0; i<count ; i++){
            if(items[i] == item)
                return i;
        }
        return -1;
    }
}
