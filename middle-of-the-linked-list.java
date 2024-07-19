//brute force approach
//time complexity:O(N+N/2)
//space complexity:O(1)
class Solution {
    public ListNode middleNode(ListNode head) {
        //step1:count number of nodes
        ListNode last=head;
        int mid=0;
        if(last==null){
            return last;
        }
        else{
           int count=0;
        while(last.next!=null){
             last=last.next;
             count++;
        }
        //step2:find middle node
         if(count%2==0){
             mid=count/2;
         }
         else{
            mid=(count/2)+1;
         }
         count=0;
         ListNode last1=head;
         while(last1.next!=null && count<mid){
              last1=last1.next;
              count++;
         }
         return last1;
        }
        
    }
}


//optimal approach: tortoise hare algorithm
//time complexity:O(N)
//space complexity:O(1)
class Solution {
    public ListNode middleNode(ListNode head) {
        //optimal approach: hare and tortoise algorithm
        //2 pointers for traversal;one fast pointer and one slow pointer.slow pointer jumps one at a time and fast pointer jumps 2 at a time.slow poiner reaches at middle at the same time as fast pointer reaches the end.
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null){
            if(fast.next.next!=null){
                 fast=fast.next.next;
            slow=slow.next;
            }
            else{
                 slow=slow.next;
                break;
            }
        }
        return slow;
    }
}
