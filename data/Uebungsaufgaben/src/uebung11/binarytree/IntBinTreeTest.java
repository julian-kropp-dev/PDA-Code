package uebung11.binarytree;
import static org.junit.jupiter.api.Assertions.*;

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
        IntBinTree zero = new IntBinTree();
        assertEquals(left.getValue(), tree.getLeft().getValue());
        assertNull(zero.getLeft());
    }

    @Test
    void getRightTest() {
        IntBinTree left = new IntBinTree(1);
        IntBinTree right = new IntBinTree(5);
        IntBinTree tree = new IntBinTree(left, 3, right);
        IntBinTree zero = new IntBinTree();
        assertEquals(right.getValue(), tree.getRight().getValue());
        assertNull(zero.getLeft());
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

    @Test
    void inOrderTest2() {
        IntBinTree root = new IntBinTree(5);
        assertFalse(root.isEmpty());
        IntBinTree leftNode = new IntBinTree(4);
        IntBinTree rightNode = new IntBinTree(6);
        root.setLeft(leftNode);
        root.setRight(rightNode);
        assertEquals(4, root.getLeft().getValue());
        assertEquals(6, root.getRight().getValue());

        assertArrayEquals(new Integer[] {4, 5, 6}, root.inorder());
    }
    @Test
    void test_einfacher_baum() {
        IntBinTree ibt1 = new IntBinTree(2);
        assertEquals( 2, ibt1.getValue(), "Baum mit Knotenwert 2" );
        IntBinTree ibt2 = new IntBinTree(4);
        assertEquals( 4, ibt2.getValue(), "Baum mit Knotenwert 4" );
        IntBinTree ibt3 = new IntBinTree(ibt1, 3, ibt2);
        //
        assertFalse( ibt3.isEmpty(), "Baum erzeugt" );
        assertEquals( 3, ibt3.getValue(), "Baum mit Knotenwert 3" );
        assertEquals( ibt1, ibt3.getLeft(), "linker Ast von ibt3 gesetzt" );
        assertEquals( ibt2, ibt3.getRight(), "rechter Ast von ibt3 gesetzt" );
        //
        ibt1.setLeft( new IntBinTree(1) );
        ibt2.setRight( new IntBinTree(5) );
        //
        assertArrayEquals( new Integer[] {1, 2, 3, 4, 5}, ibt3.inorder(), "Baum enthaelt 1, 2, 3, 4, 5" );
    }

    @Test
    void test_lueckenloser_insert() {
        Integer[] values = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 };
        IntBinTree tree = IntBinTree.createTree( values );
        assertArrayEquals( new Integer[] { 8, 4, 2, 5, 1, 6, 3, 7}, tree.inorder(), "vorgegebener Test");
        assertEquals( 8, tree.countNodes(), "Baum mit 8 Knoten" );
        assertEquals( 4, tree.countInnerNodes(), "Baum mit 8 Knoten, davon 4 innere" );
        assertEquals( 4, tree.countLeaves(), "Baum mit 8 Knoten, davon 4 Blaetter" );
        assertEquals( 4, tree.getHeight(), "Baum mit 8 Knoten, Hoehe 4" );
        assertFalse( tree.isPerfect(), "Baum mit 8 Knoten ist nicht perfekt" );
        assertFalse( tree.isFull(), "Baum mit 8 Knoten ist nicht full" );
        assertTrue( tree.isComplete(), "Baum mit 8 Knoten ist complete");
        //
        values = new Integer[] { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8, 9, 10, 11, 12, 13, 14, 15 };
        tree = IntBinTree.createTree( values );
        assertArrayEquals( new Integer[] { 8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15}, tree.inorder(), "perfekter Baum");
        assertEquals( 15, tree.countNodes(), "Baum mit 15 Knoten" );
        assertEquals( 7, tree.countInnerNodes(), "Baum mit 15 Knoten, davon 7 innere" );
        assertEquals( 8, tree.countLeaves(), "Baum mit 15 Knoten, davon 8 Blaetter" );
        assertEquals( 4, tree.getHeight(), "Baum mit 15 Knoten, Hoehe 4" );
        assertTrue( tree.isPerfect(), "Baum mit 15 Knoten ist perfekt" );
        assertTrue( tree.isFull(), "Baum mit 15 Knoten ist vollstaendig" );
        assertTrue( tree.isComplete(), "Baum mit 15 Knoten ist complete");
    }

    @Test
    void test_complete() {
        IntBinTree tree = new IntBinTree();
        assertTrue( tree.isComplete(), "leerer Baum ist complete");
        // maik & juuuuulian waren hier geilooooooooo Grüße an MC Tilman
        //
        tree = IntBinTree.createTree( new Integer[] { 1 } );
        assert tree != null;
        assertTrue( tree.isComplete(), "Baum mit einem Knoten ist complete");
        //
        tree = IntBinTree.createTree( new Integer[] { 1, 2 } );
        assert tree != null;
        assertTrue( tree.isComplete(), "Baum mit zwei Knoten ist complete");
        //
        tree = IntBinTree.createTree( new Integer[] { 1, 2, 3 } );
        assert tree != null;
        assertTrue( tree.isComplete(), "Baum mit drei Knoten ist complete");
        //
        tree = IntBinTree.createTree( new Integer[] { 1, 2, 3, 4 } );
        assert tree != null;
        assertTrue( tree.isComplete(), "Baum mit vier Knoten ist complete");
        //
        IntBinTree subtree = tree.getRight();
        subtree.setLeft( new IntBinTree(6) );
        assertFalse( tree.isComplete(), "Baum mit sechs Knoten ist nicht complete");
    }
    @Test
    void isSearchTree() {
        IntBinTree leftNode = new IntBinTree(3);
        IntBinTree rightNode = new IntBinTree(8);
        IntBinTree root = new IntBinTree(5);
        root.setRight(rightNode);
        root.setLeft(leftNode);

        assertTrue(root.isSearchTree());

        root.setLeft(rightNode);
        root.setRight(leftNode);

        assertFalse(root.isSearchTree()); //Erwartet falsches Ergebnis, da rechts < links

        IntBinTree leftLeftNode = new IntBinTree(2);
        IntBinTree leftRightNode = new IntBinTree(4);
        IntBinTree rightLeftNode = new IntBinTree(6);
        IntBinTree rightRightNode = new IntBinTree(9);

        leftNode.setLeft(leftLeftNode);
        leftNode.setRight(leftRightNode);

        rightNode.setLeft(rightLeftNode);
        rightNode.setRight(rightRightNode);

        IntBinTree tree = new IntBinTree(leftNode, root.getValue(), rightNode);

        assertTrue(tree.isSearchTree());

        IntBinTree tree2 = new IntBinTree(rightNode, root.getValue(), leftNode);

        assertFalse(tree2.isSearchTree());

        leftNode.setLeft(rightLeftNode);
        leftNode.setRight(rightRightNode);

        rightNode.setLeft(leftLeftNode);
        rightNode.setRight(leftRightNode);

        IntBinTree tree3 = new IntBinTree(leftNode, root.getValue(), rightNode);

        assertFalse(tree3.isSearchTree());

        IntBinTree child5 = new IntBinTree(2);
        IntBinTree child6 = new IntBinTree(4);
        IntBinTree child7 = new IntBinTree(6);
        IntBinTree child8 = new IntBinTree(8);
        IntBinTree child3 = new IntBinTree(child6, 3, child5); //hier vertauscht
        IntBinTree child4 = new IntBinTree(child7, 7, child8 );
        IntBinTree root4 = new IntBinTree(child3, 5, child4); //full BST

        assertFalse(root4.isSearchTree());
    }

    @Test
    void test_isSearchAVLTree_1a() {
        // aus Aufgabe 1a)
        IntBinTree ibt25 = new IntBinTree(25);
        assertFalse( ibt25.isEmpty(), "Baum erzeugt" );
        IntBinTree ibt42 = new IntBinTree(42);
        IntBinTree ibt57 = new IntBinTree(57);
        IntBinTree ibt59 = new IntBinTree(59);
        IntBinTree ibt90 = new IntBinTree(90);
        //
        IntBinTree ibt13 = new IntBinTree( null, 13, ibt25);
        IntBinTree ibt48 = new IntBinTree(ibt42, 48, ibt57);
        IntBinTree ibt77 = new IntBinTree(ibt59, 77, ibt90);
        //
        IntBinTree ibt32 = new IntBinTree(ibt13, 32, null);
        IntBinTree ibt58 = new IntBinTree(ibt48, 58, ibt77);
        //
        IntBinTree ibt40 = new IntBinTree(ibt32, 40, ibt58);
        //
        assertTrue( ibt40.isSearchTree(), "Baum Aufgabe 1a ist Suchbaum" );
        assertFalse( ibt40.isAVLTree(), "Baum Aufgabe 1a ist kein AVL-Baum" );
        //
    }

    @Test
    void test_isSearchAVLTree_1b() {
        // aus Aufgabe 1b)
        IntBinTree ibt25 = new IntBinTree(25);
        IntBinTree ibt39 = new IntBinTree(39);
        IntBinTree ibt42 = new IntBinTree(42);
        IntBinTree ibt59 = new IntBinTree(59);
        IntBinTree ibt90 = new IntBinTree(90);
        //
        IntBinTree ibt13 = new IntBinTree( null, 13, ibt25);
        IntBinTree ibt48 = new IntBinTree(ibt42, 48, null);
        IntBinTree ibt77 = new IntBinTree(ibt59, 77, ibt90);
        //
        IntBinTree ibt32 = new IntBinTree(ibt13, 32, ibt39);
        IntBinTree ibt58 = new IntBinTree(ibt48, 58, ibt77);
        //
        IntBinTree ibt40 = new IntBinTree(ibt32, 40, ibt58);
        //
        assertTrue( ibt40.isSearchTree(), "Baum Aufgabe 1b ist Suchbaum" );
        assertTrue( ibt40.isAVLTree(), "Baum Aufgabe 1b is AVL-Baum" );
    }

    @Test
    void test_isSearchAVLTree_1c() {
        // aus Aufgabe 1c)
        IntBinTree ibt25 = new IntBinTree(25);
        IntBinTree ibt37 = new IntBinTree(37);
        IntBinTree ibt59 = new IntBinTree(59);
        IntBinTree ibt48 = new IntBinTree(48);
        //
        IntBinTree ibt13 = new IntBinTree( null, 13, ibt25);
        IntBinTree ibt35 = new IntBinTree(ibt37, 35,  null);
        IntBinTree ibt77 = new IntBinTree(ibt59, 77,  null);
        //
        IntBinTree ibt32 = new IntBinTree(ibt13, 32, ibt35);
        IntBinTree ibt58 = new IntBinTree(ibt48, 58, ibt77);
        //
        IntBinTree ibt40 = new IntBinTree(ibt32, 40, ibt58);
        //
        assertFalse( ibt40.isSearchTree(), "Baum Aufgabe 1c ist kein Suchbaum" );
        assertFalse( ibt40.isAVLTree(), "Baum Aufgabe 1c ist kein AVL-Baum" );
    }





}