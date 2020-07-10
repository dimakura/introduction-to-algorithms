public class LinkedList<K extends Comparable<K>> {
  private K key;
  private LinkedList<K> next;

  LinkedList(K key) {
    this.key = key;
  }

  LinkedList<K> append(K key) {
    var end = findEnd();
    return end.next = new LinkedList<>(key);
  }

  LinkedList<K> append(LinkedList<K> list) {
    var end = findEnd();
    return end.next = list;
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

  int length() {
    var len = 1;
    var list = this;
    while (list.next != null) {
      list = list.next;
      len++;
    }
    return len;
  }

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

  private LinkedList<K> findEnd() {
    var list = this;
    while (list.next != null)
      list = list.next;
    return list;
  }
}