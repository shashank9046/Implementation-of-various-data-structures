public class SinglyLinkedList {
    Node start;

    void insert(Node node) {
        if (start == null) {
            start = node;
        } else {
            Node temp = start;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }

    void insertAtBeginning(Node node) {
        node.setNext(start);
        start = node;
    }
    void insertBeforeNode(Node node, Node beforenode) {
        if (start == null) {
            System.out.println("list emplty");
        } else {
            Node temp = start;
            Node previous = null;
            while (temp.getData() != beforenode.getData()) {
                previous = temp;
                temp = temp.getNext();

            }
            if (temp == start) {
                node.setNext(start);
                start = node;
            } else {
                node.setNext(temp);
                previous.setNext(node);

            }
        }

    }

    void insertAfterNode(Node node, Node afternode) {
        if (start == null) {
            System.out.println("empty list");
        } else {
            Node temp = start;
            while (temp.getData() != afternode.getData()) {
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
    }

    void display() {
        if (start == null) {
            System.out.println("empty list");
        } else {
            Node temp = start;
            while (temp != null) {
                System.out.print(temp.getData() + "  ");
                temp = temp.getNext();
            }
            System.out.println("null");

        }
    }

    void delete() {
        if (start == null) {
            System.out.println("empty list");
        } else {
            Node current = start;
            Node previous = null;
            while (current.getNext() != null) {
                previous = current;
                current = current.getNext();
            }
            if (current == start) {
                start = null;

            } else {
                previous.setNext(null);
            }
        }
    }

    void deleteFromBeginning() {
        if (start == null) {
            System.out.println("empty list");
        } else {
            start = start.getNext();
        }
    }

    void deleteBeforeNode(Node beforenode) {
        if (start == null) {
            System.out.println("empty list");
        } else {
            Node temp = start;
            Node current = null;
            Node previous = null;
            while (temp.getData() != beforenode.getData()) {
                previous = current;
                current = temp;
                temp = temp.getNext();
            }
            if (previous == null) {
                start = current.getNext();
            } else {
                previous.setNext(temp);
            }
        }
    }

    void deleteAfterNode(Node afternode) {
        if (start == null) {
            System.out.println("empty list");
        } else {
            Node temp = start;

            while (temp.getData() != afternode.getData()) {
                temp = temp.getNext();
            }
            if (temp.getNext() == null) {
                System.out.println("after node is the last node");
            } else {
                temp.setNext(temp.getNext().getNext());
            }
        }
    }


}
