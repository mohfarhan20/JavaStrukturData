package LinkedList;

class ListNode{

    private int value;
    private ListNode next;
    public ListNode(){
        this.value = 0;
        this.next = null;
    }
    public ListNode(int value){
        this.value= value;
        this.next = null;
    }

    // setter
    public void setValue(int value){
        this.value = value;
    }
    public void setNext(ListNode next){
        this.next = next;
    }

    //getter
    public int getValue(){
        return this.value;
    }

    public ListNode getNext(){
        return this.next;

    }

    @Override
    public String toString(){
        return"isi StudiKasus.Node : "+this.value;
    }
}