package uebung10.binarytree;

public class IntNode {
    private Integer data;
    private IntBinTree left;
    private IntBinTree right;

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

    public IntBinTree getLeft() {
        return left;
    }

    public IntBinTree getRight() {
        return right;
    }

    //setter

    public void setData(Integer data) {
        this.data = data;
    }

    public void setLeft(IntBinTree left) {
        this.left = left;
    }

    public void setRight(IntBinTree right) {
        this.right = right;
    }
}
