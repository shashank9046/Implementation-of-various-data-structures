public class MyQueue {
    private Node3 rear;
    // a field to refer front end of queue
    private Node3 front;
    private int size;// total number of elements in the queue

    
    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }
    public void sortList() {
        //Node current will point to head
        Node3 current = front, index = null;
        student temp;

        if(front == null) {
            return;
        }
        else {
            while(current != null) {
                //Node index will point to node next to current
                index = current.getNext();

                while(index != null) {
                    //If current node's data is greater than index's node data, swap the data between them
                    if(current.getData().getRoll()> index.getData().getRoll()) {
                        temp = current.getData();
                        current.setData(index.getData());
                        index.setData(temp);
                    }
                    index = index.getNext();
                }
                current = current.getNext();
            }
        }
    }

    // a method to check whether queue is empty
    public boolean isEmpty() {
        boolean response = false;
        if (size == 0) {
            response = true;
        }
        return response;
    }

    // a method to add a new element in queue
    public void enqueue(student element) {
        Node3 node = new Node3(element);
        if (front == null) {
            rear = node;
            front = node;
            size++;
        } else {
            rear.setNext(node);
            rear = node;
            size++;
        }
    }

    public void traverse() {
        if (front == null) {
            System.out.println("empty queue");
        } else {
            Node3 temp = front;
            while (temp != null) {
                System.out.print(temp.getData() + "  ");
                temp = temp.getNext();
            }
            System.out.println("null");

        }
    }

    // a method to get front element without removing it
    public Node3 peek() {
        Node3 response = null;
        if (!isEmpty()) {
            response = new Node3(front.getData());
        }
        return response;
    }

    // a method to get size of queue
    public int getSize() {
        return size;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyQueue queue = new MyQueue();
        student obj1 = new student();
        obj1.setName("shashank");
        obj1.setRoll(6);
        queue.enqueue(obj1);
        student obj2 = new student();
        obj2.setName("prashant");
        obj2.setRoll(2);
        queue.enqueue(obj2);
        student obj = new student();
        obj.setName("maneesh");
        obj.setRoll(10);
        queue.enqueue(obj);
        student obj4 = new student();
        obj4.setName("shreya");
        obj4.setRoll(4);
        queue.enqueue(obj4);
        System.out.println("the size queue is = " + queue.getSize());
        queue.sortList();
        queue.traverse();
    }

}
