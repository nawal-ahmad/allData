package allData.structure;

import allData.data.Node;

public class Queue {
    Node front;
    Node rear;
    int size;
    public Queue() {
    }

    public boolean isEmpty(){
        return front == null;
    }

    public String peek(){
        if (isEmpty()){
            return "Queue is empty!";
        }
        else {
            return front.getData();
        }
    }

    public void enqueue(String data){
        if (isEmpty()){
            Node node = new Node(data);
            front = node;
            rear = node;
            size++;
        }else{
            Node node = new Node(data);
            rear.setNext(node);
            rear = node;
            size++;
        }
    }

    public String dequeue(){
        if(isEmpty()){
            return"Queue is empty";
        }
        else{
            String deletedItem = front.getData();
            front = front.getNext();
            size--;
            return deletedItem;
        }
    }

    public int search(String data){
        if(isEmpty()){
            return -1;
        }else{
            int counter=0;
            Node temp = front;
            while (temp.getData() != data){
                if(temp == rear && temp.getData()!=data){
                    return -1;
                }
                counter++;
                temp= temp.getNext();
            }
            return counter;
        }
    }

    public int searchT(String data){
        if(isEmpty()){
            return -1;
        }else{
            int index=0;
            Node temp = front;
            while (temp != null){
                if (temp.getData() == data){
                    return index;
                }
                temp = temp.getNext();
                index++;
            }
        }
        return -1;
    }

//    public String duckDuckGoose(int k, Queue queue){
//        int n = queue.size;
//        while (n!=1){
//            duckDuckGoose(k,queue)
//        }
//    }
}
