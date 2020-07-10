// $ javac LinkedList.java Exercise_4_02.java
// $ java Exercise_4_02
public class Exercise_4_02 {
  public static void main(String[] args) {
    var list = new LinkedList<Integer>(1);
    list.append(2).append(3).append(4).append(5);
    list.print();
    list.reverse().print();
  }
}