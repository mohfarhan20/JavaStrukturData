package StudiKasus;

import StudiKasus.LinkedList;

import java.util.Scanner;

public class soal1 {

  // main soal 1
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    LinkedList list = new LinkedList();
//    list.addLast(5);
//    list.addLast(6);
//    list.addLast(7);
//    list.addLast(8);
//    list.addLast(9);
//    list.print();
//
//    boolean isNotFound = !list.search(100);
//    if(isNotFound) {
//      System.out.println("Tidak ketemu");
//    } else {
//      System.out.println("Ketemu");
//    }
    System.out.println(" Masukkan nilai : ");
    int input = userInput.nextInt();
    while (input!= 999){
      if (input!= 999){
        list.addLast(input);
      }
      input = userInput.nextInt();

    }
    System.out.println(" Isi List");
    list.print();

    System.out.println(" ==== FIND NUMBER =====");
    int cari = userInput.nextInt();
    boolean cek = list.find(cari);
    if (cek)
      System.out.println("ketemu");
    else
      System.out.println("tak ketemu");
  }
}