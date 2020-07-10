// $ javac LinkedList.java Exercise_4_01.java
// $ java Exercise_4_01
public class Exercise_4_01 {
  public static void main(String[] args) {
    var list = new LinkedList<Integer>(1);
    list.append(2).append(3).append(4).append(5);
    list.print();
    list.delete(3).print();
  }
}