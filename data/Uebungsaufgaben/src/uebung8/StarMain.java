package uebung8;
import java.sql.SQLOutput;

public class StarMain {

    public static void main(String[] args) {

        Star Sonne = new Star("Sonne", "s0");
        Star Riegel = new Star("Riegel", "s1");
        Star S2 = new Star("s2", "s2");
        Star S3 = new Star("s3", "s3");
        Star S4 = new Star("s4", "s4");
        StarDatabase Datenbank = new StarDatabase();

        Datenbank.add(Sonne);
        Sonne.setApparentMagnitudes(-1.46);
        Sonne.setDistance(8.6);
        System.out.println("Absolute M: " + Sonne.getAbsoluteMagnitude());
        Sonne.setTypes("Main sequence");
        System.out.println("TypeChecker: " + Sonne.checkType());
        Datenbank.add(Riegel);
        Riegel.setApparentMagnitudes(-1);
        Riegel.setTypes("");
        Datenbank.add(S2);
        S2.setApparentMagnitudes(0);
        Datenbank.add(S3);Datenbank.add(S4);
        S3.setApparentMagnitudes(1);
        S4.setApparentMagnitudes(2);

        Datenbank.get(5);

        Star duche = Datenbank.find("s2");
        System.out.println("Suche id s2: " + duche.getName()); //Falls Null, dann error. Könnte man mit if abfangen

        Datenbank.getMagnituderange(-5, 9);

        Datenbank.remove(0);



    }
}
