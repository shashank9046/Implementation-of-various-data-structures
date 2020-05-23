public class BinarySearchTree {
    public Node1 root;
    public BinarySearchTree(){
        root = null;
    }

    //insert() will add new node to the binary search tree
    public void insert(int data) {
        //Create a new node
        Node1 newNode = new Node1(data);

        //Check whether tree is empty
        if(root == null){
            root = newNode;
            return;
        }
        else {
            //current node point to root of the tree
            Node1 current = root, parent = null;

            while(true) {
                //parent keep track of the parent node of current node.
                parent = current;

                //If data is less than current's data, node will be inserted to the left of tree
                if(data < current.getData()) {
                    current = current.getLeft();
                    if(current == null) {
                        parent.setLeft(newNode);
                        return;
                    }
                }
                //If data is greater than current's data, node will be inserted to the right of tree
                else {
                    current = current.getRight();
                    if(current == null) {
                        parent.setRight(newNode);
                        return;
                    }
                }
            }
        }
    }

    //minNode() will find out the minimum node
    public Node1 minNode(Node1 root) {
        if (root.getLeft() != null)
            return minNode(root.getLeft());
        else
            return root;
    }

    //deleteNode() will delete the given node from the binary search tree
    public Node1 deleteNode(Node1 node, int value) {
        if(node == null){
            return null;
        }
        else {
            //value is less than node's data then, search the value in left subtree
            if(value < node.getData())
                node.setLeft(deleteNode(node.getLeft(), value));

                //value is greater than node's data then, search the value in right subtree
            else if(value > node.getData())
                node.setRight(deleteNode(node.getRight(), value));

                //If value is equal to node's data that is, we have found the node to be deleted
            else {
                //If node to be deleted has no child then, set the node to null
                if(node.getLeft() == null && node.getRight() == null)
                    node = null;

                    //If node to be deleted has only one right child
                else if(node.getLeft() == null) {
                    node = node.getRight();
                }

                //If node to be deleted has only one left child
                else if(node.getRight() == null) {
                    node = node.getLeft();
                }

                //If node to be deleted has two children node
                else {
                    //then find the minimum node from right subtree
                    Node1 temp = minNode(node.getRight());
                    //Exchange the data between node and temp
                    node.setData(temp.getData());
                    //Delete the node duplicate node from right subtree
                    node.setRight(deleteNode(node.getRight(), temp.getData()));
                }
            }
            return node;
        }
    }
    /* function to print level order traversal of tree*/
    void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }

    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(Node1 root) {
        if (root == null)
            return 0;
        else {
            /* compute  height of each subtree */
            int lheight = height(root.getLeft());
            int rheight = height(root.getRight());

            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else return (rheight + 1);
        }
    }
    // Function to traverse the tree in preorder
// and check if the given node exists in it
    static boolean ifNodeExists( Node1 node, int key)
    {
        if (node == null)
            return false;

        if (node.getData() == key)
            return true;

        // then recur on left tree /
        boolean res1 = ifNodeExists(node.getLeft(), key);
        if(res1) return true; // node found, no need to look further

        // node is not found in left, so recur on right subtree /
        boolean res2 = ifNodeExists(node.getRight(), key);

        return res2;
    }
    /* Print nodes at the given level */
    void printGivenLevel (Node1 root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.getData() + " ");
        else if (level > 1)
        {
            printGivenLevel(root.getLeft(), level-1);
            printGivenLevel(root.getRight(), level-1);
        }
    }
    //inorder() will perform inorder traversal on binary search tree
    public void inorderTraversal(Node1 node) {

        //Check whether tree is empty
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        else {

            if(node.getLeft()!= null)
                inorderTraversal(node.getLeft());
            System.out.print(node.getData() + " ");
            if(node.getRight()!= null)
                inorderTraversal(node.getRight());

        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BinarySearchTree bt = new BinarySearchTree();
        //Add nodes to the binary tree
        bt.insert(50);
        bt.insert(30);
        bt.insert(70);
        bt.insert(60);
        bt.insert(10);
        bt.insert(90);

        System.out.println("Binary search tree after insertion:");
        //Displays the binary tree
        System.out.println("in order traversal");
        bt.inorderTraversal(bt.root);
        System.out.println(" ");
        System.out.println("level order traversal");
        bt.printLevelOrder();
        System.out.print(" ");
        if (ifNodeExists(bt.root, 70))
            System.out.println("YES Node is present");
        else
            System.out.println("NO node is not present");
        Node1 deletedNode = null;
        //Deletes node 90 which has no child
        deletedNode = bt.deleteNode(bt.root, 90);
        System.out.println("\nBinary search tree after deleting node 90:");
        bt.inorderTraversal(bt.root);
        System.out.println(" ");
        System.out.println("level order traversal");
        bt.printLevelOrder();
        //Deletes node 30 which has one child
        deletedNode = bt.deleteNode(bt.root, 30);
        System.out.println("\nBinary search tree after deleting node 30:");
        bt.inorderTraversal(bt.root);
        System.out.println(" ");
        System.out.println("level order traversal");
        bt.printLevelOrder();
        //Deletes node 50 which has two children
        deletedNode = bt.deleteNode(bt.root, 50);
        System.out.println("\nBinary search tree after deleting node 50:");
        bt.inorderTraversal(bt.root);
        System.out.println(" ");
        System.out.println("level order traversal");
        bt.printLevelOrder();
    }


}




