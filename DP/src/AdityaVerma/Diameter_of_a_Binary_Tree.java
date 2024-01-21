package AdityaVerma;

public class Diameter_of_a_Binary_Tree {

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

        // Function to return the diameter of a Binary Tree.
        // int res ;
        int diameter(Node root) {

            Integer res =new Integer(Integer.MIN_VALUE);
            diameter1(root,res);
            return res;
        }

        int diameter1(Node root,Integer res) {


            if(root ==null){
                return 0;
            }

            int left = diameter1( root.left,res);
            int right = diameter1( root.right,res);

            int ans = 1+left+right;
            int temp = 1+Math.max(left,right);

            res = Math.max(ans,res);
            return temp;

        }
    }


