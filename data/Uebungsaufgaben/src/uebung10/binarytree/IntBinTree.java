package uebung10.binarytree;

public class IntBinTree {
    private IntNode root;
    private Integer content;

    //constructors
    public IntBinTree() {};

    public IntBinTree(Integer content) {
        this.content = content;
    }

    public IntBinTree(IntBinTree left, Integer content, IntBinTree right) {
        root = new IntNode(content);
        if (left != null) {
            root.setLeft(left.root);
        }

        if (right != null) {
            root.setRight(right.root);
        }
    }

    private IntBinTree(IntNode root) {
        this.root = root;
    }

    //features

    public boolean isEmpty() {
        return root == null;
    }

    public Integer getValue() {
        if (isEmpty()) return null; //error
        return root.getData();
    }

    public IntBinTree getLeft() {
        if (isEmpty()) return null; //error
        return new IntBinTree(root.getLeft());
    }

    public IntBinTree getRight() {
        if (isEmpty()) return null; //error
        return new IntBinTree(root.getRight());
    }

    public void setLeft(IntBinTree tree) {
        root.setLeft(tree.root);
    }

    public void setRight(IntBinTree tree) {
        root.setRight(tree.root);
    }



}
