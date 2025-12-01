class InsertionInTail {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
// i have to start here from tommorrow.
    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }
    public void displayLL(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        InsertionInTail ll = new InsertionInTail();
        ll.insertAtEnd(10);
        ll.insertAtEnd(12);
        ll.insertAtEnd(9);

        ll.displayLL();  
    }
    
}