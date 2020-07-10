// $ javac LinkedList.java Exercise_4_03.java
// $ java Exercise_4_03
public class Exercise_4_03 {
  public static void main(String[] args) {
    var tree = new BinarySearchTree<>(10).append(1).append(2).append(6).append(4).append(3);
    System.out.println(tree.search(6));
    System.out.println(tree.search(11));
  }
}