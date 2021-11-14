package allData.structure;

import allData.data.IntNode;

public class IntLinkedList extends LinkedList {
    private IntNode head;

    public IntLinkedList() {
    }

    public void add(int data) {
        if (head == null) {
            IntNode node = new IntNode(data);
            head = node;
        } else {
            IntNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            IntNode node = new IntNode(data);
            current.setNext(node);
        }
    }

    public int max(IntLinkedList ll) {
        int max = 0;
        if (ll.head == null) {
            System.out.println("Linked List is empty");
        } else {
            IntNode current = ll.head;
            while (current != null) {
                if (max < current.getData()) {
                    max = current.getData();
                }
                current = current.getNext();
            }
        }
        return max;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            IntNode current = head;
            System.out.print("Head -> " + current.getData() + " -> ");
            while (current.getNext() != null) {
                current = current.getNext();
                System.out.print(current.getData() + " - > ");
            }
            System.out.println("Null");
        }
    }

    public IntLinkedList sortList(IntLinkedList ll) {
        IntNode current = head;
        IntNode next = null;
        int temp;
        if (head == null) {
            return null;
        }
        else {
            while (current != null) {
                next = current.getNext();

                while (next != null) {
                    if (current.getData() > next.getData()) {
                        temp = current.getData();
                        current.setData(next.getData());
                        next.setData(temp);
                    }
                    next = next.getNext();
                }
                current = current.getNext();
            }
        }
        return ll;
    }
}
