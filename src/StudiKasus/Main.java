package StudiKasus;

public class Main {

  // main soal 1
  public static void main(String[] args) {
    System.out.println("Soal 1. Pencarian nilai dalam StudiKasus.LinkedList");
    LinkedList list = new LinkedList();
    list.addLast(5);
    list.addLast(6);
    list.addLast(7);
    list.addLast(8);
    list.addLast(9);
    list.print();
    boolean isNotFound = !list.search(100);
    if(isNotFound) {
      System.out.println("Tidak ketemu");
    } else {
      System.out.println("Ketemu");
    }

  // main soal 2 (menjumlahkan seluruh node di linkedlist)
  System.out.println("\nSoal 2. Penjumlahan Seluruh StudiKasus.Node");
  LinkedList mylist = new LinkedList();
    mylist.insertFirst(1);
    mylist.insertFirst(2);
    mylist.insertFirst(3);
    mylist.insertFirst(4);
    mylist.insertFirst(5);
    mylist.insertFirst(6);
    mylist.print();
 
  System.out.print("Jumlah seluruh node adalah = ");
  System.out.println(mylist.jumlahSeluruhNode());


  //StudiKasus.soal3
  System.out.println("\nSoal 3. Menghapus data dengan prinsip Queue ");
  System.out.println("Delete First StudiKasus.Node : ");
  System.out.println("StudiKasus.Node yang di hapus = " + mylist.delFirst());
  mylist.print();

  // main soal 4
  System.out.println("\nSoal 4. Menambah data dengan prinsip StudiKasus.Stack ");
  Stack stack = new Stack();
  stack.push(1);
  stack.push(2);
  stack.push(3);
  stack.push(4);
  System.out.println(stack);
  // assert head of stack
  System.out.println(stack.peek().getValue() == 4);


  // main soal 5
  System.out.println("\nSoal 5. Mencetak data genap ke BST");
  BinarySearchTree bst = new BinarySearchTree();
  bst.insert(1);
  bst.insert(2);
  bst.insert(3);
  bst.insert(4);
  bst.insert(5);
  bst.insert(6);

  System.out.println(bst);
  
  }
}
