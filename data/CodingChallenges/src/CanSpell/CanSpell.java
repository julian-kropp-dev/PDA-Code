package CanSpell;


public class CanSpell {
    public static void main(String[] args) {
        String[] test1 = new String[]{"a", "b", "c", "d", "e", "f"};
        System.out.println(canSpell(test1, "bed"));

    }

    public static boolean canSpell(String[] chararray, String word){
        for (String s : chararray) {
            if (word.contains(s)) return true;
        }
        return false;
    }
}
