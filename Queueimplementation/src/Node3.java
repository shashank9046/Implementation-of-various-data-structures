public class Node3 {
    private student data;
    private Node3 next;

    public Node3(student data) {
        this.data = data;
        next = null;
    }

    public student getData() {
        return data;
    }

    public void setData(student data) {
        this.data = data;
    }

    public Node3 getNext() {
        return next;
    }

    public void setNext(Node3 next) {
        this.next = next;
    }
}
