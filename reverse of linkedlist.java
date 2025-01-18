/*so i dont know about linkedlist anything i just gone through the code and understood only roughly thats all,i want to learn it today but i am in train travelling so will 
learn it tomorrow and then write my own version or explanation of the code.i just submitted my code because i wanted to maintain the streak :) */


/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution {
    Node reverseList(Node head) {
         Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }
}
