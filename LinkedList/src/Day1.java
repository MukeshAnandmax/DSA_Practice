public class Day1 {


    //  Definition for singly-linked list.
      class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
      }


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
    /*****************************************---------Q3-----------*****************************/
/**
 *
 * Q3. Class Circle
 * Solved
 * feature icon
 * Using hints is now penalty free
 * Use Hint
 * Problem Description
 *
 *
 * Construct a class Circle that represents a Circle.
 *
 * The class should support the following functionalities:-
 *
 * perimeter() -> returns the perimeter of the circle
 * area() -> returns the area of the circle
 *
 * Note: Assume Π (pi) = 3.14 for calculations.
 *
 * Input Format:
 *
 * First argument A is an integer representing the number of testcases.
 * For each case, the radius r is taken as input in new line.
 * Output Format:
 *
 * The perimeter and area of the constructed circle is printed.
 *
 * */

///https://www.scaler.com/academy/mentee-dashboard/class/89290/assignment/problems/27007/?navref=cl_pb_nv_tb
    class Circle {
        // Define properties here

        float r;
        // Define constructor here
        public Circle(int r){
            this.r=r;
        }


        float perimeter(){
            // Complete the function
            return 2*3.14f*(float)r;

        }

        float area(){
            // Complete the function
            return 3.14f*r*r;

        }
    }

/*
    Circle a = new Circle(3)  // Radius = 3
	a.perimeter() // 18.84
    a.area() // 28.26
*/
    /*****************************************---------Q4-----------*****************************/

/**
 *Q4. Class Rectangle
 * Solved
 * feature icon
 * Using hints is now penalty free
 * Use Hint
 * Problem Description
 *
 * Construct a class Rectangle that represents a rectangle.
 *
 * The class should support the following functionalities:-
 *
 * perimeter() -> returns the perimeter of the rectangle
 * area() -> returns the area of the rectangle
 * Input format:
 *
 * First argument A is an integer representing the number of testcases.
 * For each case, x (length) and y (breadth) are taken as input in new line.
 * Output format:
 *
 * The perimeter and area of the constructed rectangle are printed.
 * */
//https://www.scaler.com/academy/mentee-dashboard/class/89290/assignment/problems/27176/?navref=cl_pb_nv_tb
    class Rectangle {
        // Define properties here
        int l;
        int r;

        // Define constructor here
        public Rectangle(int l, int r){
            this.l=l;
            this.r=r;

        }


        int perimeter(){
            // Complete the function

            return 2*(l+r);

        }

        int area(){
            // Complete the function
            return l*r;

        }
    }

/*
    Rectangle a = new Rectangle(2, 3)  // Length = 2, Breadth = 3
	a.perimeter() // Should give 10
    a.area() // Should give 6
*/




    /*****************************************---------HW-Q1-----------*****************************/


/**
 * Q1. K-th element in linked list
 * Solved
 * feature icon
 * Using hints is now penalty free
 * Use Hint
 * Problem Description
 * You are given the head of a linked list A and an integer B. You need to find the B-th element of the linked list and return its value.
 *
 * Note : Follow 0-based indexing for the node numbering.
 *
 *
 *
 * Problem Constraints
 * 1 <= size of linked list <= 105
 *
 * 1 <= value of nodes <= 109
 *
 * 0 <= B < size of linked list
 * */

//https://www.scaler.com/academy/mentee-dashboard/class/89290/homework/problems/30666/?navref=cl_pb_nv_tb

    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     public int val;
     *     public ListNode next;
     *     ListNode(int x) { val = x; next = null; }
     * }
     */
    public class SolutionH1 {
        public int solve(ListNode A, int B) {

            if(B==0){
                return A.val;
            }


            return solve(A.next,B-1);

        }


    }








}
