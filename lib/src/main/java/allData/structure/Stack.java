package allData.structure;

import allData.data.Node;

public class Stack {
    private Node top;

    public Stack() {
    }

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(String data){
        if(isEmpty()){
            Node node = new Node(data);
            top = node;
        }else{
            Node node = new Node(data);
            node.setNext(top);
            top = node;
        }
    }

    public String peek(){
        return top.getData();
    }

    public String pop(){
        if(isEmpty()){
            return "Stack is empty!";
        }
        else {
            String deletedItem=top.getData();
            top = top.getNext();
            return deletedItem;
        }
    }

    public int searchT(String data){
        if (!isEmpty()) {
            Node temp = top;
            int index = 0;
            while (temp != null) {
                if (temp.getData() == data) {
                    return index;
                }
                temp = temp.getNext();
                index++;
            }
        }
        return -1;
    }
}
