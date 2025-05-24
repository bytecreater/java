import java.util.*;
public class PreOTraversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;
        public static Node BuildTree(int[] node){
            idx++;
            Node newNode = new Node(node[idx]);
            if (node[idx] == -1){
                return null;
            }
            newNode.left = BuildTree(node);
            newNode.right = BuildTree(node);

            return newNode;
        }
    }

    public static void PreOrder(Node root){
        if (root == null){
            return;
        }

        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public static void InOrder(Node root){
        if (root == null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }
    public static void PostOrder(Node root){
        if (root == null){
            return;
        }
        InOrder(root.left);
        InOrder(root.right);
        System.out.print(root.data + " ");
    }
    public static void LevelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        if (root == null){
            return;
        }
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if (currNode == null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data + " ");
                if (currNode.left != null){
                    q.add(currNode.left);
                }
                if (currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }

    } 
    
    public static void main(String[] args) {
        int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree tree = new BinaryTree();
        // Node root = new Node(10);
        // root.left = new Node(20);
        // root.right = new Node(30);

        Node root = BinaryTree.BuildTree(node);
        // PreOrder(root);
        // InOrder(root);
        // PostOrder(root);
        LevelOrder(root);
        
    }
}