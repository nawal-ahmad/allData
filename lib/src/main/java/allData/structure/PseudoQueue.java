package allData.structure;

import allData.data.Node;

public class PseudoQueue {
    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

    public PseudoQueue() {
    }

    public void enqueue(String data) {
        stack1.push(data);
    }

    public String dequeue() {
        if (stack1.getTop() == null){
            return ("pseudo queue is empty");
        }
        while (stack1.getTop() != null){
            stack2.push(stack1.pop());
        }String deleted = stack2.pop();

        while (stack2.getTop() != null){
            stack1.push(stack2.pop());
        }
        return deleted;
    }
}
