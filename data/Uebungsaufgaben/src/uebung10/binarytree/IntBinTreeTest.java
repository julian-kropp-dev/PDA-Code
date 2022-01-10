package uebung10.binarytree;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class IntBinTreeTest {

    @Test
    void emptyTreeTest() {
        IntBinTree newTree = new IntBinTree();
        assertTrue(newTree.isEmpty());
    }

    @Test
    void getValueTest() {
        IntBinTree newTree = new IntBinTree(3);
        assertEquals(3, newTree.getValue());
    }

    @Test
    void getLeftTest() {
        IntBinTree left = new IntBinTree(1);
        IntBinTree right = new IntBinTree(5);
        IntBinTree tree = new IntBinTree(left, 3, right);
        assertEquals(left.getValue(), tree.getLeft().getValue());
    }

    @Test
    void getRightTest() {
        IntBinTree left = new IntBinTree(1);
        IntBinTree right = new IntBinTree(5);
        IntBinTree tree = new IntBinTree(left, 3, right);
        assertEquals(right.getValue(), tree.getRight().getValue());
    }

    @Test
    void buildTreeTest() {
        IntBinTree child5 = new IntBinTree(5);
        IntBinTree child6 = new IntBinTree(6);
        IntBinTree child7 = new IntBinTree(7);
        IntBinTree child8 = new IntBinTree(8);
        IntBinTree child3 = new IntBinTree(child5, 3, child6);
        IntBinTree child4 = new IntBinTree(child7, 4, child8 );
        IntBinTree root = new IntBinTree(child3, 2, child4); //full BST

        /*

                2
              /   \
            3       4
           / \     / \
          5   6   7   8

         */

        assertEquals(2, root.getValue());
        assertEquals(3, root.getLeft().getValue());
        assertEquals(4, root.getRight().getValue());
        assertEquals(5, root.getLeft().getLeft().getValue());
        assertEquals(6, root.getLeft().getRight().getValue());
        assertEquals(7, root.getRight().getLeft().getValue());
        assertEquals(8, root.getRight().getRight().getValue());
        assertFalse(root.isEmpty());



    }
}
