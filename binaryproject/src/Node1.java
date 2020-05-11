public class Node1 {
    private int data;
    private Node1 left;
    private Node1 right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node1 getLeft() {
        return left;
    }

    public void setLeft(Node1 left) {
        this.left = left;
    }

    public Node1 getRight() {
        return right;
    }

    public void setRight(Node1 right) {
        this.right = right;
    }

    public Node1(int data){
        //Assign data to the new node, set left and right children to null
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

