
/* class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution {
    public Node rotate(Node head, int k) {
        int len=1;
        Node temp = head;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        k=k%len;
        if(k==0)
            return head;
        temp.next = head;
        temp=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}
