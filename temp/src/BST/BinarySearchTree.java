package BST;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    //root of BST
    Node root;

    class Node {
        int value;
        Node left, right;

        public Node(int key) {
            this.value = key;
            left = right = null;

        }
    }



    //constructor
    BinarySearchTree(){
        root=null;
    }

    // This method mainly calls insertRec()
    void insert(int key){
        root=insertRec(root,key);
    }

    Node insertRec(Node root, int key) {
        /* If the tree is empty,
           return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        else if (key < root.value) {
            root.left=  insertRec(root.left,key);

        } else if (key > root.value) {
            root.right=insertRec(root.right,key);

        }
        /* return the (unchanged) node pointer */
        return root;

    }

    void inorder() {
        inorderRec(root);
    }

    // A utility function to
    // do inorder traversal of BST

    void preOrderTraversal(Node root){          //preorder (Root, Left, Right)
        if(root!=null){
            System.out.println(root.value);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
    void postOrderTraversal(Node root){        //Postorder (Left, Right, Root)
        if(root!=null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root.value);

        }
    }

    void inorderRec(Node root)             //Inorder (Left, Root, Right)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.value);
            inorderRec(root.right);

        }
    }
    void printLevelOrder(){
        Queue<Node> queue=new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()){

            Node temp= queue.poll();
            System.out.print(temp.value+" ");

            /*Enqueue left child */

            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }


        }
    }
    void printLeafNodes(Node root){

        if(root==null){
            return;
        }
        // If node is leaf node, print its data
        if(root.left==null && root.left==null){
            System.out.print(root.value+" ");
        }
        if (root.left!=null){
            printLeafNodes(root.left);
        }
        if(root.right!=null){
            printLeafNodes(root.right);
        }

    }
    void printLeftView(Node root){
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            // number of nodes at current level
            int n = queue.size();

            // Traverse all nodes of current level
            for (int i = 1; i <= n; i++) {
                Node temp = queue.poll();

                // Print the left most element at
                // the level
                if (i == 1)
                    System.out.print(temp.value + " ");

                // Add left node to queue
                if (temp.left != null)
                    queue.add(temp.left);

                // Add right node to queue
                if (temp.right != null)
                    queue.add(temp.right);
            }
        }
    }
     int findHeight(Node temp){

        if(root==null){
            System.out.println("Tree is empty");
            return 0;
        }else {
            int leftHeight=0;
            int rightHeight=0;

            if(temp.left != null)
                leftHeight = findHeight(temp.left);

            if(temp.right != null)
                rightHeight = findHeight(temp.right);

            int max = (leftHeight > rightHeight) ? leftHeight : rightHeight;

            return (max + 1);
        }



    }


        public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // print inorder traversal of the BST
        tree.inorder();
//        tree.printLevelOrder();
//        tree.printLeafNodes(tree.root);
//        System.out.println(tree.findHeight(tree.root));

//        tree.preOrderTraversal(root);
//        tree.postOrderTraversal(root);
        tree.printLeftView(tree.root);
    }



}
