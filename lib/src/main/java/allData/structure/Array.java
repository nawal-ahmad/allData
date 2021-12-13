package allData.structure;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int [length];
    }

    public Boolean isEmpty(){
        return count == 0;
    }

    public void print(){
        System.out.print("[");
        for (int i=0; i< count; i++) {
            System.out.print(items[i]);
            if(i<count-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    public void insert(int value){
        if (items.length == count){
            int[] newItems = new int [count*2];
            for (int i=0; i<count; i++){
                newItems[i]=items[i];
            }
            items = newItems;
        }
        items[count] = value;
        count++;
    }

    public void removeAt(int index){
        if (index<0 || index>count){
            System.out.println("Out of range");
        }else{
            for (int i=index; i<count; i++){
                items[i] = items[i+1];
            }
            count--;
        }
    }

    public int[] reversingArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    public int[] reversingSame(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public int[] addToMiddleIndex(int value, int[] array) {
        int[] added = new int[array.length + 1];
        int middleIndex = array.length / 2;

        for (int i = 0; i < added.length; i++) {
            if (i < middleIndex) {
                added[i] = array[i];
            } else if (i == middleIndex) {
                added[i] = value;
            } else {
                added[i] = array[i - 1];
            }
        }
        return added;
    }

    public int binarySearch(int[] array, int value) {
        int lower = 0;
        int mid;
        int upper = array.length - 1;
        while (lower <= upper) {
            mid = lower + (upper - lower);
            if (value == array[mid]) return mid;
            else if (value > array[mid])
                lower = mid + 1;
            else upper = mid - 1;
        }
        return -1;
    }

}
