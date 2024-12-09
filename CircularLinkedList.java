package Comp2112.FirstPart;

public class CircularLinkedList {

    private DoubleNode current;
    private int size;

    public CircularLinkedList() {
        this.current = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void PrintingNames() {
        if (current == null) {
            System.out.println("Liste boş!");
            return;
        }
        DoubleNode temp = current.next;
        do {
            System.out.println("-> " + temp.name + " ");
            temp = temp.next;
        } while (temp != current.next);
        System.out.println();
    }

    public DoubleNode getNodeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        DoubleNode temp = current;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void DoubleNodeAdd(String name) {
        DoubleNode newNode = new DoubleNode(name);
        if (current == null) {
            current = newNode;
            newNode.next = current;
            newNode.previous = current;
        } else {
            newNode.next = current.next;
            newNode.previous = current;
            current.next.previous = newNode;
            current.next = newNode;
            current = newNode;
        }
        size++;
    }

    public void removeDoubleNode(DoubleNode nodeToRemove) {
        if (size == 0 || nodeToRemove == null) {
            return;
        }

        DoubleNode temp = current;

        if (current == nodeToRemove && current.next == current) {
            current = null;
            size--;
            return;
        }

        do {
            if (temp.next == nodeToRemove) {
                temp.next = nodeToRemove.next;
                nodeToRemove.next.previous = temp;
                if (nodeToRemove == current) {
                    current = nodeToRemove.previous;
                }
                size--;
                break;
            }
            temp = temp.next;
        } while (temp != current);
    }
}
