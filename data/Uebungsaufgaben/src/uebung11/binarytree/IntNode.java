package uebung11.binarytree;

public class IntNode {
    private Integer data;
    private IntBinTree left; //Alternativ auch mit IntNode left & right umsetzbar. Dann aber in IntBinTree.java aufpassen
    private IntBinTree right;

    //constructor
    public IntNode(Integer data) {
        this.data = data;
        left = null; //Knoten kann auch Blatt sein (keine Kinder)
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