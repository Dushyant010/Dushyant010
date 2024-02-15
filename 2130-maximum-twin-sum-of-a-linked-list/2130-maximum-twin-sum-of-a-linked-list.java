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
    public int pairSum(ListNode head) {
        
        int n =0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        ListNode temp = head;
        while(temp != null){
            n++;
            ans.add(temp.val);
            temp = temp.next;
        }
        
        int start = 0;
        int end = n-1;
        int sum =0;
        while(start < end){
            
            sum = Math.max(sum, (ans.get(start) + ans.get(end)));
                           start++;
                           end--;
            
        }
                           
                           return sum;
        
    }
}