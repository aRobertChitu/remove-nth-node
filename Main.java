


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



public class Main {



    
    
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int numberOfNodes = 0;
        ListNode firstNode = head;

        while(head!=null){
            head = head.next;
            numberOfNodes++;
        }

        head = firstNode;
        int nodeToRemove = numberOfNodes - n;

        if(nodeToRemove == 0 ){
            return head.next;
        }
        for(int i = 1; i< nodeToRemove; i++){
            head = head.next;
        }
        head.next = head.next.next;


        return firstNode;

    }


}