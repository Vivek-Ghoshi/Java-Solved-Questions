package DSA.LinkedList;

// LinkedList Implementation;

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
    }
}

public class MylinkedList {
    public static ListNode buildList(){
        ListNode head = new ListNode(10);
        ListNode n1 = new ListNode(20);
        ListNode n2 = new ListNode(30);
        ListNode n3 = new ListNode(40);
        ListNode n4 = new ListNode(50);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        return head;
    }
    public static void printList(ListNode head){
        while(head != null){
           System.out.print(head.val + " -> ");
           head = head.next;
        }
        System.out.println("null");
    }
    public static int size(ListNode head){
        int size = 0;
        while(head != null){
            head = head.next;
            size++;
        }
        return size;
    }
    public static ListNode addFirst(ListNode head,int val){
        ListNode nn = new ListNode(val);
        if(head == null){
            head = nn;
        }
        nn.next = head;
        head = nn;
        return head;
    }
    public static void addLast(ListNode head,int val){
        ListNode nn = new ListNode(val);
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        nn.next = temp.next;
        temp.next = nn;
    }
    public static ListNode addAtIndex(ListNode head,int index,int val){
        int size = size(head);
        if(index < 0 || index >= size){
           throw new IndexOutOfBoundsException("Index are not in reach"); 
        }
       if(index == 0){
        return addFirst(head, val);
         
       }
       ListNode nn = new ListNode(val);
       ListNode temp = head;
       while(--index != 0){
        temp = temp.next;
       }
       nn.next = temp.next;
       temp.next = nn;
       return head;
    }
    public static void main(String[] args) {
        ListNode head = buildList();
        // printList(head);
        // head = addFirst(head, 5);
        // printList(head);
        // addLast(head, 60);
        printList(head);
        head =  addAtIndex(head, 0, 5);
        printList(head);

    }

}
