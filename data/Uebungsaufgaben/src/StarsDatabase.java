import java.util.Scanner;
public class StarsDatabase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean id_found = false;
        boolean distance_found = false;

        System.out.println("What's the key of the star you're looking for?");
        String user_input = scanner.nextLine(); //user input for the star's key
        scanner.close();

        String [] names = {"Sirius", "Alpha Centauri", "Rigel", "Almaaz", "Luhman 16"};
        String [] ids = {"TYC 5949-2777-1", "TYC 9007-5849-1", "TYC 5331-1752-1", "TYC 2907-1275-1", "WISE J1049-5319A"};
        double [] distance = {8.6, 4.37, 860, 2000, 6.589};
        double [] apparentMagnitudes = {-1.46, -0.27, 0.13, 2.92, 14.94};
        String [] types = {"Main sequence", "Main sequence", "Blue supergiant", "Yellow supergiant", "Brown dwarf"};

        //for-loop checks whether there is a star with the user's id or not. If there is a star with this id it prints out the appropriate name of the star
        for (int i = 0; i < ids.length; i++){
            if (ids[i].equals(user_input)){
                System.out.println(ids[(i)] + "'s name is " + names[(i)]);
                id_found = true;
            }
        }
        // error message if there is no matching star for the id
       if (!id_found) System.out.println("Sadly, the star you're looking for was not found. Mayby your key is invalid.");

       System.out.println("------- \nThe following stars have a distance shorter than 10 years:");
       // for-loop is looking for stars with a distance shorter than 10 years
        for (int j = 0; j < ids.length; j++){
            if (distance[j] < 10) {
                System.out.println(names[j] + "'s distance: " + distance[j]);
                distance_found = true;
            }

        }
        //if there is no star with a distance shorter than 10 years the user get's an error-warning
        if (!distance_found) System.out.println("Sadly, there is no star with an distance shorter than 10 years...");

    }
}
