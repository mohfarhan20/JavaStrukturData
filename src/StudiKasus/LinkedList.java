package StudiKasus;

public class LinkedList {
  private Node head;
  private int idx = 0;

  public LinkedList() {
    this.head = null;
  }
  public Node getHead() {
    return this.head;
  }

  public boolean isEmpty() {
    return this.head == null;
  }

  public void insertFirst(int value) {
    Node newNode = new Node(value);
    newNode.setNext(this.head);
    this.head = newNode;
    idx++;
  }

  public void addLast(int value) {
    Node newNode = new Node(value);
    if(isEmpty()) {
      this.head = newNode;
      return;
    }
    Node curr = this.head;
    while(curr.getNext() != null) {
      curr = curr.getNext();
    }
    curr.setNext(newNode);
  }

  public void print() {
    Node nodePtr = this.head;
    while (nodePtr != null) {
      System.out.println(nodePtr.getValue());
      nodePtr = nodePtr.getNext();
    }
  }



// ---- No 1
  public boolean search(int needle) {
    if (searchRecursion(needle, this.head) == null) {
      return false;
    }

    return true;
  }

  public Node searchRecursion(int needle, Node curr) {
    if (curr == null || curr.getValue() == needle) {
      return curr;
    } 

    return searchRecursion(needle, curr.getNext());
  }

  // no 1 versi beda
public boolean find(int cari){
    Node ptr = this.head;
    boolean cek = false;

    while (ptr != null){
      if (ptr.getValue() == cari){
        cek = true;
      }
      ptr = ptr.getNext();
    }
    return cek;
}


// ----- Akhir no 1




// ------- NO 2
  public double jumlahSeluruhNode() {
    return this.jumlahSeluruhNodeRecursion(0, this.head);
  }

  public int jumlahSeluruhNodeRecursion(int accumulator, Node curr) {
    if (curr == null) return accumulator;

    return this.jumlahSeluruhNodeRecursion(accumulator + curr.getValue(), curr.getNext());
  }

  // versi 2 sum of all node
  public double sumOfAllNode(Node last){
    double result = 0;
    while (last != null){
      result += last.getValue();
      last = last.getNext();
    }

  return result;
  }



// ------ Akhir No 2

// ---- No.3
  public int delFirst(){
    Node del = new Node();
    del = this.head;
    this.head = del.getNext();
    del.setNext(null);
    return del.getValue();
  }
// ---- Akhir no.3


}