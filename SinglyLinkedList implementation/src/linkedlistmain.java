public class linkedlistmain {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        Node n1 = new Node();
        n1.setData(50);

        Node n2 = new Node();
        n2.setData(20);

        Node n3 = new Node();
        n3.setData(60);

        Node n4 = new Node();
        n4.setData(54);

        Node n5 = new Node();
        n5.setData(70);

        list.insert(n1);
        System.out.println("after insertion at first place");
        list.display();
        list.insertAtBeginning(n2);
        System.out.println("after insertion at beginning");
        list.display();
        list.insertAfterNode(n3, n1);
        System.out.println("insertion after given node");
        list.display();
        list.insertBeforeNode(n4, n2);
        System.out.println("insertion before given node");
        list.display();
        list.deleteBeforeNode(n3);
        System.out.println("delete before given node");
        list.display();
        list.insert(n5);
        list.display();
        list.display();

    }

}
