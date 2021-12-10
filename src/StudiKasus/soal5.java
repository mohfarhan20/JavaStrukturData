package StudiKasus;

import java.util.*;

public class soal5 {

  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();
   Scanner sc = new Scanner(System.in);
    System.out.println(" Masukkan data genap : ");
    int value = sc.nextInt();
    while (value != 999){
      if (value!= 999)
      bst.insert(value);
     value = sc.nextInt();
    }
    System.out.println(bst);


  }
}