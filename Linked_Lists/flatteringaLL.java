class Solution {
    // Function to flatten a linked list
    Node flatten(Node root) {
        if(root==null || root.next==null) return root;
            
        Node head1 = root;
        Node head2 = null;
        while(head1.next!=null) {
            head2 = head1.next.next;
            head1 = merge(head1, head1.next);
            head1.next = head2;
        }
        
        return root;
    }
    
    public static Node merge(Node head1, Node head2) {
        head1.next = null;
        
        Node head = head1;
        
        Node temp = head1;
        head1 = head1.bottom;
        while(head1!=null && head2!=null) {
            if(head1.data <= head2.data) {
                temp.bottom = head1;
                head1 = head1.bottom;
            } else {
                temp.bottom = head2;
                head2 = head2.bottom;
            }
            temp = temp.bottom;
        } 
        
        while(head1!=null) {
            temp.bottom = head1;
            head1 = head1.bottom;
            temp = temp.bottom;
        } 
        
        while(head2!=null) {
            temp.bottom = head2;
            head2 = head2.bottom;
            temp = temp.bottom;
        } 
        
        return head;
        
    }
}
