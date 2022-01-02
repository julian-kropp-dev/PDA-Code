package SumOfABinaryTree;

public class BinaryTree {
    private Node root;
    private BinaryTree(Node root) {
        this.root = root;
    }

    public BinaryTree() {}

    public BinaryTree(int data) {
        this.root = new Node(data);
    }

    public BinaryTree(BinaryTree left, int data, BinaryTree right) {
        root = new Node(data);
        if (left != null) {
            root.setLeft(left.root);
        }
        if (right != null) {
            root.setRight(right.root);
        }
    }

    public int find_sum(Node root) {
        if (root == null) {
            return 0;
        }
        return root.getData() + find_sum(root.getLeft()) + find_sum(root.getRight());
    }
}

//O(2n) = O(n)
