class Solution {
    public ListNode reverseList(ListNode head) {
        //if the list is null, then return null
        if(head == null) return null;

        //create  cur and prev to better visualize the pointer
        ListNode cur = head;
        ListNode prev = null;
        //when there is a node to continue
        while(cur != null){
            ListNode next = cur.next;
            //reverse the list
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}

//         prev    cur   next
//         null ->  1  -> 2  -> 3 -> 4
//                     prev   cur    next
//         null   <-    1      2  ->  3  -> 4
