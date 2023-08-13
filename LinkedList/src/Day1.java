public class Day1 {


    /**
     * Definition for singly-linked list.
     * class ListNode {
     * public int val;
     * public ListNode next;
     * ListNode(int x) { val = x; next = null; }
     * }
     */
    public class Solution {

/*You are given A which is the head of a linked list. Print the linked list in space separated manner.

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


}
