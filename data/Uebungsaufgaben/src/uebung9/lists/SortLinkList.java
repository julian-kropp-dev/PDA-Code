// Alternative Methode zum lösen dieser Aufgaben durch Sortierung neu eingefügter Elemente mittels Sortieralgorithmus. 

package uebung9.lists;


class NodeeSort {
    Object value;
    NodeeSort next;

    NodeeSort(Object val) {
        value = val;
        next = null;

    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public NodeeSort getNext() {
        return next;
    }

    public void setNext(NodeeSort next) {
        this.next = next;
    }

}

public class SortLinkList {
    NodeeSort head;
    int size = 0;

    NodeeSort add(Object val) {
        // TODO Auto-generated method stub
        if (head == null) {
            NodeeSort nodee = new NodeeSort(val);
            head = nodee;
            size++;
            return head;
        }
        NodeeSort temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        NodeeSort newNode = new NodeeSort(val);
        temp.setNext(newNode);
        newNode.setNext(null);
        size++;
        return head;
    }

    NodeeSort sort(NodeeSort nodeSort) {

        for (int i = size - 1; i >= 1; i--) {
            NodeeSort finalval = nodeSort;
            NodeeSort tempNode = nodeSort;

            for (int j = 0; j < i; j++) {

                int val1 = (int) nodeSort.value;
                NodeeSort nextnode = nodeSort.next;
                int val2 = (int) nextnode.value;
                if (val1 > val2) {

                    if (nodeSort.next.next != null) {
                        NodeeSort CurrentNext = nodeSort.next.next;
                        nextnode.next = nodeSort;
                        nextnode.next.next = CurrentNext;
                        if (j == 0) {
                            finalval = nextnode;
                        } else
                            nodeSort = nextnode;

                        for (int l = 1; l < j; l++) {
                            tempNode = tempNode.next;
                        }

                        if (j != 0) {
                            tempNode.next = nextnode;

                            nodeSort = tempNode;
                        }
                    } else if (nodeSort.next.next == null) {
                        nextnode.next = nodeSort;
                        nextnode.next.next = null;
                        for (int l = 1; l < j; l++) {
                            tempNode = tempNode.next;
                        }
                        tempNode.next = nextnode;
                        nextnode = tempNode;
                        nodeSort = tempNode;

                    }

                } else
                    nodeSort = tempNode;
                nodeSort = finalval;
                tempNode = nodeSort;
                for (int k = 0; k <= j && j < i - 1; k++) {
                    nodeSort = nodeSort.next;
                }

            }

        }
        return nodeSort;

    }

    public static void main(String[] args) {
        SortLinkList objsort = new SortLinkList();
        NodeeSort nl1 = objsort.add(9);
        NodeeSort nl2 = objsort.add(71);
        NodeeSort nl3 = objsort.add(6);
        NodeeSort nl4 = objsort.add(81);
        NodeeSort nl5 = objsort.add(2);

        NodeeSort NodeSort = nl5;

        NodeeSort finalsort = objsort.sort(NodeSort);
        while (finalsort != null) {
            System.out.println(finalsort.getValue());
            finalsort = finalsort.getNext();
        }

    }
}
