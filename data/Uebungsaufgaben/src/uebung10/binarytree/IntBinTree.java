package uebung10.binarytree;

public class IntBinTree {
    private final IntNode root;

    //constructors
    public IntBinTree() {root = null;}

    public IntBinTree(Integer content) {
        this.root = new IntNode(content);
    }

    public IntBinTree(IntBinTree left, Integer content, IntBinTree right) {
        if ( content == null ) {
            root = null;
        } else {
            root = new IntNode(content);
            root.setLeft(left);
            root.setRight(right);
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
        return root.getLeft();
    }

    public IntBinTree getRight() {
        if (isEmpty()) return null; //error
        return root.getRight();
    }

    public void setLeft(IntBinTree tree) {root.setLeft(tree);}

    public void setRight(IntBinTree tree) {
        root.setRight(tree);
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

    private int fillLastLine( Integer[] values, int cursor ) {
        int newcur = cursor;
        if ( getLeft() != null ) {
            newcur = getLeft().fillLastLine( values, cursor );
            if ( newcur < values.length ) {
                newcur = getRight().fillLastLine( values, newcur );
            }
        } else {
            setLeft( new IntBinTree( values[newcur++] ) );
            if ( newcur < values.length ) {
                setRight( new IntBinTree( values[newcur++] ) );
            }
        }
        return newcur;
    }


    public static IntBinTree createTree(Integer[] values) {
        if ( values.length == 0 )
            return null;
        IntBinTree res = new IntBinTree(values[0]);
        int cursor = 1;
        while ( cursor < values.length ) {
            cursor = res.fillLastLine(values, cursor);
        }
        return res;
    }

    //features part D

    public int countNodes() {
        if ( isEmpty() )
            return 0;
        int count = 1;
        if ( getLeft() != null ) {
            count += getLeft().countNodes();
        }
        if ( getRight() != null ) {
            count += getRight().countNodes();
        }
        return count;
    }

    public int countInnerNodes() {
        if ( isEmpty() )
            return 0;
        int count = 1;
        boolean hasChildren = false;
        if ( getLeft() != null ) {
            count += getLeft().countInnerNodes();
            hasChildren = true;
        }
        if ( getRight() != null ) {
            count += getRight().countInnerNodes();
            hasChildren = true;
        }
        return hasChildren ? count : 0;
    }

    public int countLeaves() {
        if ( isEmpty() )
            return 0;
        int count = 0;
        boolean hasChildren = false;
        if ( getLeft() != null ) {
            count += getLeft().countLeaves();
            hasChildren = true;
        }
        if ( getRight() != null ) {
            count += getRight().countLeaves();
            hasChildren = true;
        }
        return hasChildren ? count : 1;
    }

    public int getHeight() {
        if ( isEmpty() )
            return 0;
        int height = 0;
        if ( getLeft() != null ) {
            height = getLeft().getHeight();
        }
        if ( getRight() != null ) {
            int rightHeight = getRight().getHeight();
            if ( rightHeight > height ) {
                height = rightHeight;
            }
        }
        return height+1;
    }


    //features part E

    public boolean isPerfect() {
        if ( isEmpty() )
            return true;
        int height = getHeight();
        int nodes = countNodes();
        return ( Math.pow(2, height) == (nodes+1) );
    }

    public boolean isFull() {
        if ( isEmpty() )
            return false;
        if ( getLeft() != null ) {
            if ( getRight() != null ) {
                return ( getLeft().isFull() && getRight().isFull() );
            } else {
                return false;
            }
        } else {
            return ( getRight() == null );
        }
    }

    /*
     * Fuehrt rekursiv die Pruefung auf Hoehenunterschiede durch ( s. u.)
     * 	@return: minHeight, maxHeight, (max = 0: gescheitert)
     */

    private int[] checkComplete() {
        if ( getLeft() != null ) {
            if ( getRight() != null ) {
                int[] minMaxLeft = getLeft().checkComplete();
                if ( minMaxLeft[1] == 0 )
                    return new int[] {0, 0};		// links gescheitert
                int[] minMaxRight = getRight().checkComplete();
                if ( minMaxRight[1] == 0 )
                    return new int[] {0, 0};		// rechts gescheitert
//				System.out.println( "lmin: " + minMaxLeft[0] + ", lmax: " + minMaxLeft[1] + ", rmin: " + minMaxRight[0] + ", rmax: " + minMaxRight[1]);
                //
                int diffMaxLeftMinRight = minMaxLeft[1] - minMaxRight[0];
                if ( diffMaxLeftMinRight == 0 ) {
                    // Maximum links == Minimum rechts, d.h. alle min und max muessen gleich sein
                    if ( minMaxLeft[0] < minMaxRight[1] )
                        return new int[] {0, 0};		// gescheitert: Delle links
                    else
                        return new int[] { minMaxLeft[0]+1, minMaxLeft[1]+1 };					// gut: alle gleich
                } else {
                    if ( diffMaxLeftMinRight > 1 )
                        return new int[] {0, 0};		// gescheitert: Hoehendifferenz zu gross
                    // Maximum links == Minimum rechts+1, d.h. es gibt eine Stufe
                    if ( minMaxLeft[0] == minMaxLeft[1] ) {
                        // Stufe nicht im linken Subtree
                        // Stufe hat maximal die Hoehe 1 und ist damit okay
                        return new int[] { minMaxRight[0]+1, minMaxLeft[1]+1 };					// gut: stufe zwischen Minimum rechts und Maximum links
                    } else {
                        // Stufe im linken Subtree gefunden, d.h. minLeft == minRight
                        // 	es darf weder im Uebergang zum rechten Subtree, noch im rechten Subtree selbst eine Stufe geben
                        if ( minMaxRight[0] != minMaxRight[1] )
                            return new int[] {0, 0};		// gescheitert: auch Stufe rechts
                        else
                            return new int[] { minMaxLeft[0]+1, minMaxLeft[1]+1 };				// gut: gesamter Baum wie linker Baum
                    }
                }
            } else {	// rechts: min = max = 0
                int[] minMaxLeft = getLeft().checkComplete();
                if ( minMaxLeft[1] == 1 )		// in diesem Fall maximal zulaessige linke tiefe: 1
                    return new int[] {1, 2};
                else							// gescheitert oder zu tief
                    return new int[] {0, 0};
            }
        } else {
            if ( getRight() == null )
                return new int[] {1, 1};			// Blatt
            else									// gescheitert: rechts duerfen nur Kinder sein, wenn auch links Kinder sind
                return new int[] {0, 0};
        }
    }

    /*
     * In einem vollstaendigen Baum duerfen sich die maximale und minimale Hoehe um hoechstens 1 unterscheiden.
     * 	Der Hoehere muss links liegen.
     * 	Ausserdem muss diese Bedingung auch fuer jeden Teilbaum erfuellt sein!
     */

    public boolean isComplete() {
        if ( isEmpty() )
            return true;
        int[] minMax = this.checkComplete();
        return ( minMax[1] != 0 );
    }




}
