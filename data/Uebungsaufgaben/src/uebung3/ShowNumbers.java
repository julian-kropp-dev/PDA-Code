package uebung3;

public class ShowNumbers {
    public static void main(String[] args) {
        int[] data = new int[] {1, 2, 3, 4, 2};
        int i = 0;
        String colon = ", ";
        for (int j: data){
            if (!(i < data.length - 1)) colon = "";
            System.out.print(data[(i)] + colon );
            i ++;
        }
    }
}
