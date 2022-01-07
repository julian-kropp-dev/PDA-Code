package uebung10.binarytree;

public class IntNode {
    private Integer data;
    private IntNode left;
    private IntNode right;

    //constructor
    public IntNode(Integer data) {
        this.data = data;
        left = null;
        right = null;
    }

    //getter
    public Integer getData() {
        return data;
    }

    public IntNode getLeft() {
        return left;
    }

    public IntNode getRight() {
        return right;
    }

    //setter

    public void setData(Integer data) {
        this.data = data;
    }

    public void setLeft(IntNode left) {
        this.left = left;
    }

    public void setRight(IntNode right) {
        this.right = right;
    }
}
