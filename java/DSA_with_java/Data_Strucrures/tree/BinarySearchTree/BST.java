package dsa_with_java.data_strucrures.tree.BinarySearchTree;

public class BST {
    private class Node {
        int data;
        Node left;
        Node right;
        Node(int dta){
            data=dta;
            left=null;
            right=null;
        }
    }
    Node root=null;
    void Insert(int data){
        Node newNode= new Node(data);
        if (root==null){root=newNode;}
        else {
            Node tempRoot=root;
            while (true) {
                if (data<=tempRoot.data){
                    if (tempRoot.left==null){tempRoot.left=newNode;break;}
                    else tempRoot=tempRoot.left;
                }
                else{
                    if (tempRoot.right==null){tempRoot.right=newNode;break;}
                    else tempRoot=tempRoot.right;
                }
            }
        }

    }
    static void TraverseInfix(Node temp){
        if (temp == null) {
            System.out.println("Tree is Empty");
            return; // Return early when the tree is empty
        }
        //if (temp==null){System.out.println("Tree is Empity");}
        if (temp.left!=null) TraverseInfix(temp.left);
        System.out.print(" "+temp.data);
        
        if (temp.right!=null) TraverseInfix(temp.right);
        
        
    }
}
