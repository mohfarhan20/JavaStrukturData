package StudiKasus;

public class BinarySearchTree {
  private BstNode root;
  
  public boolean isEven(int value) {
    return value % 2 == 0;
  }

  public void insert(int value) {
    if(!isEven(value)) {
      System.out.println("Data harus genap");
      return;
    }

    this.root = this.insert(this.root, value);
  }

  public BstNode insert(BstNode root, int value) {
    if(root == null) {
      return new BstNode(value);
    }

    if(value < root.getValue()) {
      root.setLeft(this.insert(root.getLeft(), value));
    } else if (value > root.getValue()) {
      root.setRight(this.insert(root.getRight(), value));
    }

    return root;
  }

  @Override
  public String toString() { // dfs inorder traversal
    return "[ " + toStringHelper(this.root) + " ]";
  }

  public String toStringHelper(BstNode root) {
    if (root == null) {
      return "";
    }
// in oder
    // return toStringHelper(root.getLeft()) + root.getValue() + "  " + toStringHelper(root.getRight());
    // pre order
  // return (root.getValue())+" "+toStringHelper(root.getLeft())+ toStringHelper(root.getRight());
    // post order
 return toStringHelper(root.getLeft())+ toStringHelper(root.getRight())+ root.getValue()+" ";


  }
//  public String toString() {
//    return "BinaryTree\n{" +
//            "root=" + root +
//            '}';
//  }
}

class BstNode {
  private BstNode left;
  private BstNode right;
  private int value;

  public BstNode() {}

  public BstNode(int value) {
    this.value = value;
  }

  public BstNode getLeft() {
    return this.left;
  }

  public BstNode getRight() {
    return this.right;
  }

  public int getValue() {
    return this.value;
  }

  public void setLeft(BstNode left) {
    this.left = left;
  }
  
  public void setRight(BstNode right) {
    this.right = right;
  }

  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Node{" +
            "value=" + value +
            ",\nleft=" + left +
            ",right=" + right +
            '}';
  }

}