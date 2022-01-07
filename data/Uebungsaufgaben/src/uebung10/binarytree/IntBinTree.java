package uebung10.binarytree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class IntBinTree {
    private IntNode root;
    private Integer content;

    //constructors
    public IntBinTree() {};

    public IntBinTree(Integer content) {
        root = new IntNode(content);
        //root.setData(content);
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

    //features part A

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

    //features part B

    public Integer[] inorder() {
        LinkedList <Integer> integerValues = new LinkedList<Integer>(); //created LinkedList because it's easier to add values
        if(!isEmpty()) {
            getLeft().inorder();
            integerValues.add(getValue());
            getRight().inorder();
            integerValues.add(getValue());
        }

        return integerValues.toArray(new Integer[0]); //convert LinkedList back to Array
    }



}
