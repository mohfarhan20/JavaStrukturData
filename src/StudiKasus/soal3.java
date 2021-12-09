package StudiKasus;

import StudiKasus.LinkedList;

public class soal3 {

  public static void main(String[] args) {
  LinkedList list = new LinkedList();
    list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);
    list.addLast(5);
    list.print();
  System.out.println("Delete First StudiKasus.Node : ");
  System.out.println("StudiKasus.Node yang di hapus = " + list.delFirst());
  }
}