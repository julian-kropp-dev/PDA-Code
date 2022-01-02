package SumOfABinaryTree;

public class BinaryTreeTestClass {
    public static void main(String[] args) {
        BinaryTree new_node = new BinaryTree();
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node2.setLeft(node3);
        node2.setRight(node4);
        node3.setLeft(node5);
        node3.setRight(node6);

        System.out.println("Sum of all values of this tree is (should print 20):");
        System.out.println(new_node.find_sum(node2));
    }

}
