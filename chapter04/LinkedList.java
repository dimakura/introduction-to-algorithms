public class LinkedList<K extends Comparable<K>> {
  private K key;
  private LinkedList<K> next;

  LinkedList(K key) {
    this.key = key;
  }

  LinkedList<K> append(K key) {
    var list = this;
    while (list.next != null)
      list = list.next;
    return list.next = new LinkedList<>(key);
  }

  void print() {
    var element = this;
    while (element != null) {
      System.out.print(element.key);
      System.out.print(" ");
      element = element.next;
    }
    System.out.println();
  }

  // Exercise 4.1
  LinkedList<K> delete(K key) {
    if (key.compareTo(this.key) == 0) {
      return next;
    } else {
      var parent = this;
      var element = parent.next;
      while (element != null) {
        if (element.key.compareTo(key) == 0) {
          parent.next = element.next;
          break;
        } else {
          parent = element;
          element = parent.next;
        }
      }

      return this;
    }
  }

  // Exercise 4.2
  LinkedList<K> reverse() {
    var reversed = this;
    var element = this.next;
    reversed.next = null;

    while (element != null) {
      var next = element.next;
      element.next = reversed;
      reversed = element;
      element = next;
    }

    return reversed;
  }
}