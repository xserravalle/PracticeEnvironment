// JAVA SINGLY LINKED LIST BASICS

public class JavaSinglyLinkedList {
    // DEFINE SINGLY LINKED LIST NODE
    public static class Node {
        public int val;
        public Node next;

        // CONSTRUCTOR FOR NODE THAT ASSIGNS THE VALUE TO THE VALUE OF THE NODE, AND THEN POINTS THE NEXT VALUE
        // TO NULL UNTIL ASSIGNED
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // INSTANTIATE head AND tail NODES
    private Node head;
    private Node tail;

    public JavaSinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // INSERT NODE AT HEAD
    public void addFirst (int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // APPEND NODE TO TAIL
    public void addLast (int val) {
        Node newNode = new Node(val);
        if (tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // TRAVERSAL
    public void printList() {
        Node current = head;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(current.val).append(" -> ");
            current = current.next;
        }
        sb.append("null");
        System.out.println(sb.toString());
    }

    // REVERSE LIST IN-PLACE
    public void reverse() {
        Node prev = null;
        Node current = head;
        tail = head; // OLD TAIL BECOMES NEW HEAD

        while (current != null) {
            Node nextTemp = current.next; // SAVE FORWARD LINK
            current.next = prev; // REVERSE DIRECTION
            prev = current; // SLIDE PREVIOUS FORWARD
            current = nextTemp; // SLIDE CURRENT FORWARD
        }
        head = prev; // PREVIOUS NOW SITS ON THE NEW HEAD
    }
    public static void main(String[] args) {
        JavaSinglyLinkedList list = new JavaSinglyLinkedList();

        System.out.println("--- Building List ---");
        list.addLast(1);
        list.addLast(2);
        list.addLast(4);
        list.printList(); // Expected: 1 -> 2 -> 4 -> null

        System.out.println("\n--- Inserting at Head ---");
        list.addFirst(0);
        list.printList(); // Expected: 0 -> 1 -> 2 -> 4 -> null

        System.out.println("\n--- Reversing In-Place ---");
        list.reverse();
        list.printList(); // Expected: 4 -> 2 -> 1 -> 0 -> null
    }
}
