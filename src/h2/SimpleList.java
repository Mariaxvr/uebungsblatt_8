package h2;

public class SimpleList {
    Node head;

    public SimpleList() {
        head = new Node(Integer.MIN_VALUE);
    }

    public Node getFirst() {
        return head.next;
    }

    public Node getLast() {
        Node current = head.next;

        if (current == null) {
            return null;
        }
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }
    public void append(int newValue) {
        Node newNode = new Node(newValue);

        Node last = getLast();

        if (last == null) {
            head.next = newNode;
        } else  {
            last.next = newNode;
        }
    }
    public Node findFirst(int value) {
        Node current = head.next;

        while (current != null) {
            if (current.value == value) {
                return current;
            }
        }
        return null;
    }
    public boolean insertAfter(int preValue, int newValue) {
        Node preNode = findFirst(preValue);

        if (preNode == null) {
            return false;
        }
        Node newNode = new Node(newValue);
        newNode.next = preNode.next;
        preNode.next = newNode;

        return true;
    }
    public boolean delete(int value) {
        Node current = head;

        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void printList() {
        Node current = head.next;
        while (current != null) {
            System.out.println(current.value);
            if (current.next != null) System.out.println(", ");
            current = current.next;
        }

    }
}
