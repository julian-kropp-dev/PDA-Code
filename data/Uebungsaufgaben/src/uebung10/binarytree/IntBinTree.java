package uebung10.binarytree;


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
        if ( isEmpty() )
            return null;
        Integer[] leftArr = new Integer[0];
        Integer[] rightArr = new Integer[0];
        if ( getLeft() != null )
            leftArr = getLeft().inorder();

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



}
