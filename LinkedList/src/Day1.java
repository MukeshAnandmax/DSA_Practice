public class Day1 {


    /**
     * Definition for singly-linked list.
     * class ListNode {
     * public int val;
     * public ListNode next;
     * ListNode(int x) { val = x; next = null; }
     * }
     */

    /*****************************************---------Q1-----------*****************************/

    //https://www.scaler.com/academy/mentee-dashboard/class/89290/assignment/problems/30649?navref=cl_tt_nv
    public class Solution {

        /**You are given A which is the head of a linked list. Print the linked list in space separated manner.

        Note : The last node value must also be succeeded by a space and after printing the entire list you should print a new line
        Problem Constraints
        1 <= size of linked list <= 105

        1 <= value of nodes <= 109
        */
        public void solve(ListNode A) {
            while (A != null) {
                System.out.print(A.val + " ");
                A = A.next;
            }
            System.out.println();
        }
    }
    /*****************************************---------Q2-----------*****************************/
/**    You are given A which is the head of a linked list. Also given is the value B and position C. Complete the function that should insert a new node with the said value at the given position.

 Notes:
 In case the position is more than length of linked list, simply insert the new node at the tail only.
 In case the pos is 0, simply insert the new node at head only.
 Follow 0-based indexing for the node numbering.

 Problem Constraints
 1 <= size of linked list <= 105
 1 <= value of nodes <= 109
 1 <= B <= 109
 0 <= C <= 105*/


    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     public int val;
     *     public ListNode next;
     *     ListNode(int x) { val = x; next = null; }
     * }
     */

    //https://www.scaler.com/academy/mentee-dashboard/class/89290/assignment/problems/30536/?navref=cl_pb_nv_tb
    public class Solution {
        public ListNode solve(ListNode head, int B, int C) {
            ListNode temp = new ListNode(B);
            if(C==0){
                temp.next = head;
                return temp;
            }
            int count=0;
            ListNode curr=head;
            while(count !=C-1 && curr.next!=null){
                count++;
                curr = curr.next;
            }
            temp.next= curr.next;
            curr.next= temp;
            return head;
        }
    }

}
