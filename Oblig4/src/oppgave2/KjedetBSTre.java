package oppgave2;

import java.util.Iterator;

public class KjedetBSTre<T extends Comparable<? super T>> {

    Node root;


    public boolean contains(T entry) {
        return false;
    }

    public T getEntry(T entry) {
        return null;
    }

    public T add(T entry) {
        return null;
    }

    public T remove(T entry) {
        return null;
    }

    public Iterator<T> getInorderIterator() {
        return null;
    }



    private class Node {

        T data;
        Node left, right;

        public Node(T data) {
            this.data = data;
            left = right = null;  // IntelliJ autocomplete, tydligvis viker det
        }

        private Node(T data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}