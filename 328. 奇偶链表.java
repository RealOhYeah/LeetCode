/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     public static ListNode oddEvenList(ListNode head) {

        if (head==null||head.next==null){
            return head;
        }

        ListNode j = new ListNode();
        ListNode hj = j;

        ListNode o = new ListNode();
        ListNode ho = o;

        int index = 1;


        while (head != null){

            //偶数
            if (index%2==0){

                o.val = head.val;

                index++;
            }else {
            //奇数

                j.val = head.val;

                index++;
            }


            head = head.next;

            if (head!=null&&head.next!=null){

                if ((index-1)%2 == 0){

                    o.next = new ListNode();
                    o = o.next;


                }else {

                    j.next = new ListNode();
                    j = j.next;


                }


            }


        }


        j.next = ho;


        return hj;

    }


}
