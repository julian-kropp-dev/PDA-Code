package uebung10.binarytree;


import java.util.ArrayList;

public class IntBinTree {
    private IntNode root;

    //constructors
    public IntBinTree() {};

    public IntBinTree(Integer content) {
        this.root = new IntNode(content);
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

    public void setLeft(IntBinTree tree) {root.setLeft(tree.root);}

    public void setRight(IntBinTree tree) {
        root.setRight(tree.root);
    }

    //features part B

    public Integer[] inorder() {
        if ( isEmpty() )
            return null;
        Integer[] leftArr = new Integer[0];
        Integer[] rightArr = new Integer[0];
        if ( getLeft() != null )
            leftArr = getLeft().inorder();
//		System.out.println(getValue());
        if ( getRight() != null )
            rightArr = getRight().inorder();
        //
        Integer[] result = new Integer[leftArr.length + 1 + rightArr.length];
        for ( int i = 0; i < leftArr.length; i++ ) {
            result[i] = leftArr[i];
        }
        result[leftArr.length] = getValue();
        for ( int i = 0; i < rightArr.length; i++ ) {
            result[leftArr.length + 1 + i ] = rightArr[i];
        }
        return result;
    }


    //features part C

    //features part D

    //features part E



}
