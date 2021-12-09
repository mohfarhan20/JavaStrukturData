package StudiKasus;

import StudiKasus.LinkedList;

import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int idx = -1;
        LinkedList list = new LinkedList();
//  list.insertFirst(1);
//    list.insertFirst(2);
//    list.insertFirst(3);
//    list.insertFirst(4);
//    list.insertFirst(5);
//    list.insertFirst(6);
//    list.print();
        System.out.println(" Masukkan nilai : ");
        int input = userInput.nextInt();
        while (input!= 999){
            if (input!= 999){
                list.addLast(input);
            }
            input = userInput.nextInt();
        idx ++;
        }
        System.out.println(" Isi List");
        list.print();
    System.out.println("Jumlah seluruh node adalah");
    System.out.println(list.sumOfAllNode(list.getHead()));
//    System.out.println(list.jumlahSeluruhNode());
        System.out.println(" rata2 : "+(list.sumOfAllNode(list.getHead()))/(idx+1));
  }

}