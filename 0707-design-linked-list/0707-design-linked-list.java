class MyLinkedList {
    class Node {
            int data;
            Node next;

            Node (int val){
                this.data = val;
                this.next=null;
            }
        }
        Node head;
        int size;

    public MyLinkedList() {
        head=null;
        size=0;
        
    }
    
    public int get(int index) {
        if(index<0||index>=size){
            return -1;
        }
        Node curr=head;
        for (int i=0; i<index;i++){
            curr=curr.next;
        }
        return curr.data;
    }
    
    public void addAtHead(int val) {
        Node node1 = new Node(val);
        node1.next=head;
        head=node1; 
        size++;
        return;
    }
    public void addAtTail(int val) {
        Node node1 = new Node(val);
         if(head==null){
            head=node1;
            size++;
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=node1;
        size++;
       
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0||index>size){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
            }
            if(index==size){
                addAtTail(val);
                return;
            }
            Node curr=head;
            for(int i=0;i<index-1;i++){
                curr=curr.next;
            }
            Node node1=new Node(val);
            node1.next=curr.next;
            curr.next=node1;
            size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0||index>=size){
            return;
        }
        if(index==0){
            head=head.next;
            size--;
            return;
        }
        Node curr=head;
        for(int i=0;i<index-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        size--;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */