package allData.structure;

import allData.data.IntNode;

public class StackInt {
    private IntNode top;

    public StackInt() {
    }


    public IntNode getTop() {
        return top;
    }

    public void setTop(IntNode top) {
        this.top = top;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        if (isEmpty()) {
            IntNode node = new IntNode(data);
            top = node;
        } else {
            IntNode node = new IntNode(data);
            node.setNext(top);
            top = node;
        }
    }

    public int peek() {
        return top.getData();
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            int deletedItem = top.getData();
            top = top.getNext();
            return deletedItem;
        }
    }

    public int getMax() {
        int max = 0;
        IntNode temp = top;
        while (temp != null) {
            if (temp.getData() > max) {
                max = temp.getData();
            }
            temp = temp.getNext();
        }
        return max;
    }

    public static int maximum(StackInt stack) {
        int max = stack.top.getData();
        if (stack.top == null) {
            return -1;
        }
        IntNode temp = stack.top;
        while (temp != null) {
            if (temp.getData() > max) {
                max = temp.getData();
            }
            temp = temp.getNext();
        }
        return max;
    }

    public static int getMaxStack(StackInt st) {
        StackInt maxSt = new StackInt();
        IntNode temp = st.top;

        maxSt.push(temp.getData());

        while (temp != null) {
            if (temp.getData() > maxSt.peek())
                maxSt.push(temp.getData());
            temp = temp.getNext();
        }
        return maxSt.peek();
    }
}
