package Comp2112.FirstPart;

public class LinkedListClass {

    Node last;
    Node first;

    public LinkedListClass() {
        this.first = null;
        this.last = null;

    }

    public void removeNodeLast() {
        if (first == null || first.next == null) {
            first = null;
            last = null;
            return;
        }
        Node tmp = first;
        while (tmp.next != last) {
            tmp = tmp.next;
        }
        tmp.next = null;
        last = tmp;
    }

    public void NodeAdd(String name) {
        Node newNode = new Node(name);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }

    }

}
