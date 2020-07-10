public class BinarySearchTree<K extends Comparable<K>> {
  private K key;
  private BinarySearchTree<K> left;
  private BinarySearchTree<K> right;

  BinarySearchTree(K key) {
    this.key = key;
  }

  BinarySearchTree<K> append(K key) {
    int comparison = key.compareTo(this.key);

    if (comparison == 0) {
      // element is already in the tree!
    } else if (comparison < 0) {
      if (left == null) {
        left = new BinarySearchTree<>(key);
      } else {
        left.append(key);
      }
    } else {
      if (right == null) {
        right = new BinarySearchTree<>(key);
      } else {
        right.append(key);
      }
    }

    return this;
  }

  LinkedList<K> orderedList() {
    return orderedList(this).first;
  }

  private Pair<LinkedList<K>> orderedList(BinarySearchTree<K> tree) {
    var list = new LinkedList<>(tree.key);
    var head = list;
    var end = list;

    if (tree.left != null) {
      var left = orderedList(tree.left);
      head = left.first;
      // NOTE: appends are done to the lists of len=1
      // System.out.println(left.second.length());
      left.second.append(list);
    }

    if (tree.right != null) {
      var right = orderedList(tree.right);
      end = right.second;
      // NOTE: appends are done to the lists of len=1
      // System.out.println(list.length());
      list.append(right.first);
    }

    return new Pair<>(head, end);
  }

  private class Pair<T> {
    T first;
    T second;

    public Pair(T first, T second) {
      this.first = first;
      this.second = second;
    }
  }
}