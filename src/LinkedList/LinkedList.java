package LinkedList;

public class LinkedList {

    public ListNode head;

    // konstruktor
    public LinkedList(){
        this.head = null;
    }

    // Append Method
    public void append(int newValue){

        // Membuat node baru
        ListNode newNode = new ListNode(newValue);
        // Node untuk transversing array
        ListNode NodeNxt;

        // Jika headnya null (list masih kosong)
        // node baru akan langsung diijadikan head
        if (this.head == null)
            this.head = newNode;

            // Jika sudah ada head maka node next akan menampung head
        else{
            NodeNxt = this.head;
            // transverse sampai ke node akhir
            // Menggunakan nodeNext sebagai pointer untuk menjelajahi
            // semua node
            while(NodeNxt.getNext()!= null){
                NodeNxt = NodeNxt.getNext();
            }
            // Node Nxt akan mengeSet bahwa node (newNode) akan jadi node terakhir
            // dengan demikian data baru akan dimasukkan ke dalam node
            NodeNxt.setNext(newNode);

        }
    }



    // getting value by Index
    public int getValue(int index){
        ListNode current = this.head;
        int count = 0;
        while (current != null ){
            if (count == index)
                return current.getValue();
            count ++;
            current = current.getNext();
        }
        return 0;
    }

    // set value by index
    public void setValue(int index, int value){
        ListNode current = this.head;
        int count = 0;
        boolean toggle = false;

        while (current != null && !toggle){
            if (count == index){
                current.setValue(value);
                toggle = true;
            }
            count ++;
            current = current.getNext();
        }
    }




    public void print(){
        // Pointer for transversing list
        ListNode temp;
        temp = this.head;
        while(temp != null){
            // Menampilkan listNode ke layar
            System.out.print(temp.getValue()+" ");
            temp = temp.getNext();
        }
    }

    // Insert First
    public void insertFirst(int newValue){
        ListNode newNode = new ListNode(newValue);
        newNode.setNext (this.head);
        this.head = newNode;

    }

    // Insert After
    public void insertAfter(int newValue, ListNode PreviousNode){
        ListNode newNode = new ListNode(newValue);
        newNode.setNext(PreviousNode.getNext());
        PreviousNode.setNext(newNode);

    }

    // Membuat fungsi toString


    // Delete first
    public ListNode delFirst(){
        ListNode NodePtr = new ListNode();
        NodePtr = head;
        head = NodePtr.getNext();
        NodePtr.setNext(null);
        return NodePtr;
    }
    // Delete After
    public ListNode delAfter(ListNode Previous){
        ListNode NodePtr = new ListNode();
        NodePtr = Previous.getNext();
        Previous.setNext(NodePtr.getNext());
        NodePtr.setNext(null);
        return NodePtr;
    }
    public boolean isOneElement(){
        return this.head.getNext() == null;
    }

// Delete Last
// Simpan Last Element dan Previous dari Last


    public ListNode delLast(){
        ListNode PrevLast;
        ListNode Ptr = this.head;

        if (isOneElement()){
            Ptr = delFirst();
        }


        while(Ptr.getNext().getNext()!= null){
            Ptr = Ptr.getNext();
        }
        PrevLast = Ptr;
        PrevLast.setNext(null);
        return PrevLast;
    }



    @Override
    public String toString(){
        ListNode ptr = this.head;
        String temp = " ";
        while(ptr!=null){
            temp += ptr.getValue()+" ";
            ptr = ptr.getNext();
        }
        return temp;
    }

}
