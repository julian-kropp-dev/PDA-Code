package SumOfABinaryTree;

public class Node {
    private int data;
    private Node left;
    private Node right;

    //constructor
    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    //getter
    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    //setter

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}
