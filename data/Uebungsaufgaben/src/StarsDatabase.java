public class StarsDatabase {
    public static void main(String[] args) {
        String [] names = {"Sirius", "Alpha Centauri", "Rigel", "Almaaz", "Luhman 16"};
        String [] ids = {"TYC 5949-2777-1", "TYC 9007-5849-1", "TYC 5331-1752-1", "TYC 2907-1275-1", "WISE J1049-5319A"};
        double [] distance = {8.6, 4.37, 860, 2000, 6.589};
        double [] apparentMagnitudes = {-1.46, -0.27, 0.13, 2.92, 14.94};
        String [] types = {"Main sequence", "Main sequence", "Blue supergiant", "Yellow supergiant", "Brown dwarf"};

        for (int i = 0; i < ids.length; i++){
            if (ids[i].equals("TYC 5331-1752-1")){
                System.out.println(names[(i)] + "'s key is TYC 5331-1752-1");
            }
        }
        for (int j = 0; j < ids.length; j++){
            if (distance[j] < 10) System.out.println(names[j] + "'s distance: " + distance[j]);
        }
    }
}
