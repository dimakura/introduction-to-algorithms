// $ javac LinkedList.java Exercise_4_04.java
// $ java Exercise_4_04
public class Exercise_4_04 {
  public static void main(String[] args) {
    var tree = new BinarySearchTree<>(10).append(1).append(2).append(6).append(4).append(3);
    tree.orderedList().print();
  }
}