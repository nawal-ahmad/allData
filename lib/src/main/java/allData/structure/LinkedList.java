package allData.structure;

import allData.data.Node;

public class LinkedList {
    private Node head;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void add(String data) {
        // check if the linked lst is empty
        if (head == null) {
//            System.out.println("Linked List is Empty!");
            Node node = new Node(data);
            head = node;
            size++;

        } else {
            Node current;
            current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            Node node = new Node(data);
            current.setNext(node);
            size++;
        }
    }

    public String remove(int index) {
        String deletedItem = "";
        if (head == null) {
            System.out.println("List is empty!");
        } else if (index >= size || index < 0) {
            System.out.println("index is out of bounds");
        } else if (index == 0) {
            deletedItem = head.getData();
            head = head.getNext();
            size--;
            return deletedItem;
        } else {
            int counter = 0;
            Node current = head;
            Node previous = null;
            while (counter != index) {
                previous = current;
                current = current.getNext();
                counter++;
            }
            previous.setNext(current.getNext());
            current.setNext(null);
            deletedItem = current.getData();
            size--;
        }
        return deletedItem;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            Node current = head;
            System.out.print("Head -> " + current.getData() + " -> ");
            while (current.getNext() != null) {
                current = current.getNext();
                System.out.print(current.getData() + " - > ");
            }
            System.out.println("Null");
        }
    }

    public void insert(String data) {
        Node node = new Node(data);
        if (head != null) {
            node.setNext(head);
        }
        head = node;
        size++;
    }

    public void insertBefore(int index, String data) {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            int counter = 0;
            Node previous = null;
            Node current = head;
            while (index != counter) {
                previous = current;
                current = current.getNext();
                counter++;
            }
            Node node = new Node(data);
            previous.setNext(node);
            node.setNext(current);
            size++;
        }
    }

    public void insertAfter(int index, String data) {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            int counter = 0;
            Node previous = null;
            Node current = head;
            while (index != counter) {
                previous = current;
                current = current.getNext();
                counter++;
            }
            previous = current;
            current = current.getNext();
            Node node = new Node(data);
            previous.setNext(node);
            node.setNext(current);
            size++;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public String peak() {
        if (head != null) {
            return head.getData();
        }
        return "List is empty";
    }

    public int search(String data) {
        int index = 0;
        if (head == null) {
            System.out.println("Linked list is empty!");
        } else {
            Node current = head;
            while (current != null) {
                if (current.getData() == data) {
                    return index;
                }
                current = current.getNext();
                index++;
            }

        }
        System.out.println("The given data isn't exist in the linked list");
        return -1;
    }

    public boolean include(String data) {
        if (head == null) {
            System.out.println("List s empty!");
        } else {
            Node current = head;
            while (current != null) {
                if (current.getData() == data) {
                    return true;
                }
                current = current.getNext();
            }
        }
        return false;
    }

    public void update(int index, String data) {
        if (head == null) {
            System.out.println("Linked list is empty!");
        } else {
            int counter = 0;
            Node current = head;
            while (counter != index) {
                current = current.getNext();
                counter++;
            }
            current.setData(data);
        }
    }

    public String kth(int k) {
        int index = size - k - 1;
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
        } else if (k > size || k < 0) {
            System.out.println("Index is out of bounds");
        } else {
            int counter = 0;
            while (counter != index) {
                current = current.getNext();
                counter++;
            }
        }
        return current.getData();
    }

    public LinkedList zipLists(LinkedList ll1, LinkedList ll2) {
        LinkedList ll3 = new LinkedList();
        Node current1 = ll1.head;
        Node current2 = ll2.head;
        while (current1 != null || current2 != null) {
            if (current1 == null) {
                ll3.add(current2.getData());
                current2 = current2.getNext();
            } else if (current2 == null) {
                ll3.add(current1.getData());
                current1 = current1.getNext();
            } else {
                ll3.add(current1.getData());
                ll3.add(current2.getData());
                current1 = current1.getNext();
                current2 = current2.getNext();
            }
        }
        return ll3;
    }

    public static LinkedList reversedList(LinkedList list) {
        Node current = list.head;
        Node next = null;
        Node prev = null;

        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        list.head = prev;
        return list;
    }

    public boolean isPalindrome(LinkedList ll) {
        Stack stack = new Stack();
        if (ll.head == null) {
            System.out.println("LinkedList is empty");
        } else if (ll.size <= 1) {
            System.out.println("linkedlist is single element");
        } else {
            Node current = ll.head;
            while (current!= null) {
                stack.push(current.getData());
                current = current.getNext();
            }
            current = ll.head;
            while (current != null) {
                if (current.getData() != stack.pop()) {
                    return false;
                }
                current = current.getNext();
            }
        }
        return true;
    }

    // return the middle node of the linked list.
    //If there are two middle nodes, return the second middle node.
    public String middle(LinkedList ll){
        int mid = (ll.getSize()/2);
        int counter =0;
        Node current = head;
        while (counter != mid){
            current = current.getNext();
            counter++;
        }
        return current.getData();
    }

    public LinkedList duplicate(LinkedList list){
        Node current = list.head;
        Node next = list.head.getNext();

        while(current.getNext() != null){
            if (next.getData() == current.getData()){
                current.setNext(next.getNext());
                next.setNext(null);
            }
            current = current.getNext();
            next = current.getNext();
        }
        return list;
    }

}

