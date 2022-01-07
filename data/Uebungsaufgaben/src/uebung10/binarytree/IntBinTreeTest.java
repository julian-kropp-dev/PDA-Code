package uebung10.binarytree;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void inorderTest() {

    }
}
