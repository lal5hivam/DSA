class Solution{
    Node removeDuplicates(Node head){
        //code here
        Node prev = head;
        Node temp = prev.next;
        while(temp!= null){
            if(prev.data == temp.data){
                prev.next = temp.next;
                if(temp.next != null){
                    temp.next.prev = prev;
                }
                temp = temp.next;
            } else{
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}
