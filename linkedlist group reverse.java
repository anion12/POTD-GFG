class Solution {
    public static Node reverseKGroup(Node head, int k) {
     
        int len = getLength(head);
        Node origH = null;
        Node origT = null, tmpH = null, temp=null;
        Node curr=head;
        while(len > 0){
            int j=k;
            j = Math.min(j, len);
            while(j>0){
                Node nex = curr.next;
                if(tmpH == null){
                    tmpH = curr;
                    temp = curr;
                }
                else {
                    curr.next = tmpH;
                    tmpH = curr;
                }
                curr=nex;
                j--;
                len--;
            }
            if(origH == null){
                origH = tmpH;
                origT = temp;
            }
            else {
                origT.next = tmpH;
                origT = temp;
            }
            tmpH = null;
            temp=null;
        }
        origT.next = null;
        return origH;
    }
    public static int getLength(Node head){
        int len =0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
}
