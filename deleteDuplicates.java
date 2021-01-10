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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=new ListNode();
        ArrayList<ListNode> arr = new ArrayList<>();
        arr.add(head);
        while (head!=null) {
            //System.out.println("arr.size="+arr.size());
            //System.out.println("head.val="+head.val);
            //System.out.println("arr.last="+arr.get(arr.size()-1).val);
            //System.out.println(head.val!=(arr.get(arr.size()-1).val));
            if (head.val!=(arr.get(arr.size()-1).val)) arr.add(head);
            if (head.val==(arr.get(arr.size()-1).val)) {
                head=head.next;
            } else {
                arr.add(head);
                head=head.next;
            }
            //head=head.next;
        }
        System.out.println("arr.size="+arr.size());
        temp = arr.get(arr.size()-1);
        System.out.println(temp.val);
        for (int i=1;i<arr.size();i++) {
            System.out.println("arr.i="+arr.get(i).val);
            System.out.println(arr.get(arr.size()-i-1).val);
            temp=new ListNode(arr.get(arr.size()-i-1).val, temp);
            System.out.println("temp.val="+temp.val);
        }
        return temp;
        /*head = arr.get(arr.size()-1);
        System.out.println(head.val);
        for (int i=1;i<arr.size();i++) {
            System.out.println(arr.get(arr.size()-i-1).val);
            head=new ListNode(arr.get(arr.size()-i-1).val, head);
            System.out.println("head.val="+head.val);
        }
        return head;*/
    }
}
