package StudiKasus;

import StudiKasus.LinkedList;

public class soal1 {

  // main soal 1
  public static void main(String[] args) {
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
  }
}