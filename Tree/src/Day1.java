import java.util.ArrayList;

public class Day1 {
/******************************************---Q1----***************************************************/
/***
 * Q1. Inorder Traversal
 * Solved
 * feature icon
 * Using hints is now penalty free
 * Use Hint
 * Problem Description
 * Given a binary tree, return the inorder traversal of its nodes' values.
 *
 *
 *
 * Problem Constraints
 * 1 <= number of nodes <= 105
 * */
//https://www.scaler.com/academy/mentee-dashboard/class/89300/assignment/problems/214?navref=cl_tt_lst_sl
    /**
     * Definition for binary tree*/
      class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) {
          val = x;
          left=null;
           right=null;
          }
      }

    public class Solution {
        public ArrayList<Integer> inorderTraversal(TreeNode A) {

            ArrayList<Integer> res = new ArrayList<>();

            res = inorderTraversal1(A,res);

            return res;

        }


        public ArrayList<Integer> inorderTraversal1(TreeNode A,ArrayList<Integer> res) {


            if(A==null){
                return res;
            }

            res = inorderTraversal1(A.left,res);
            res.add(A.val);
            res = inorderTraversal1(A.right,res);

            return res;
        }



    }
/******************************************---Q2----***************************************************/
/**
 *
 *Q2. Preorder Traversal
 * Solved
 * feature icon
 * Using hints is now penalty free
 * Use Hint
 * Problem Description
 * Given a binary tree, return the preorder traversal of its nodes values.
 *
 *
 *
 * Problem Constraints
 * 1 <= number of nodes <= 105
 *
 * */
//https://www.scaler.com/academy/mentee-dashboard/class/89300/assignment/problems/222?navref=cl_tt_nv



public class Solution1 {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {

        ArrayList<Integer> res = new ArrayList<Integer>();

        res = preorderTraversal1(A,res);

        return res;

    }
    public ArrayList<Integer> preorderTraversal1(TreeNode A,ArrayList<Integer> res) {


        if(A==null){
            return res;
        }

        res.add(A.val);
        res = preorderTraversal1( A.left,res);
        res = preorderTraversal1( A.right,res);

        return res;

    }

}
/******************************************---Q3----***************************************************/

/**
 * Q3. Postorder Traversal
 * Solved
 * feature icon
 * Using hints is now penalty free
 * Use Hint
 * Problem Description
 * Given a binary tree, return the Postorder traversal of its nodes values.
 *
 *
 *
 * Problem Constraints
 * 1 <= number of nodes <= 105
 * */
//https://www.scaler.com/academy/mentee-dashboard/class/89300/assignment/problems/229?navref=cl_tt_nv

    /**
     * Definition for binary tree
     * class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) {
     *      val = x;
     *      left=null;
     *      right=null;
     *     }
     * }
     */
    public class Solution2 {
        public ArrayList<Integer> postorderTraversal(TreeNode A) {

            ArrayList<Integer> res = new ArrayList<Integer>();
            res = postorderTraversal1(A, res);
            return res;

        }


        public ArrayList<Integer> postorderTraversal1(TreeNode A, ArrayList<Integer> res) {


            if(A==null){
                return res;
            }

            res = postorderTraversal1(A.left, res);
            res = postorderTraversal1(A.right, res);
            res.add(A.val);
            return res;

        }
    }
/******************************************---Q4----***************************************************/


    /**
     *
     * Q4. Tree Height
     * Solved
     * feature icon
     * Using hints is now penalty free
     * Use Hint
     * Problem Description
     * You are given the root node of a binary tree A. You have to find the height of the given tree.
     *
     * A binary tree's height is the number of nodes along the longest path from the root node down to the farthest leaf node.
     *
     *
     *
     * Problem Constraints
     * 1 <= Number of nodes in the tree <= 105
     *
     * 0 <= Value of each node <= 109
     * */
//https://www.scaler.com/academy/mentee-dashboard/class/89300/assignment/problems/11757?navref=cl_tt_nv


    public class Solution3 {
        public int solve(TreeNode A) {

            if(A==null){
                return 0;
            }

            int lh = solve(A.left);
            int rh= solve(A.right);

            return Math.max(lh,rh)+1;
        }
    }


}
