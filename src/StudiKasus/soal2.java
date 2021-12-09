package StudiKasus;

import StudiKasus.LinkedList;

public class soal2 {

    public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insertFirst(1);
    list.insertFirst(2);
    list.insertFirst(3);
    list.insertFirst(4);
    list.insertFirst(5);
    list.insertFirst(6);
    list.print();
    System.out.println("Jumlah seluruh node adalah");
    System.out.println(list.jumlahSeluruhNode());
  }
}