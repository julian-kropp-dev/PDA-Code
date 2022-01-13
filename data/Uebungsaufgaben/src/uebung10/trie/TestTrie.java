package uebung10.trie;

public class TestTrie {

    private static final String[] KEYS = new String[] {
            "green", "greed", "great", "grey",
            "grass", "blue", "blues", "bla",
            "blank", "blame", "black"
    };

    public static void main(String[] args) {
        Trie trie = new Trie();
        for (int i=0;i<KEYS.length;i++) {
            trie.addValue(KEYS[i].toCharArray(), i + 1);
        }
        for (int i=0;i<KEYS.length;i++) {
            System.out.println(trie.findValue(KEYS[i].toCharArray()));
        }
        // Expected output: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11
    }

}