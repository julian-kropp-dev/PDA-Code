package uebung8;

public class Star {
    private String name;
    private String id;
    private double distance;
    private double apparentMagnitudes;
    private String types;


    public Star(String name, String id) {
        this.name = name;
        this.id = id;
    }

    //Set
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }
    public void setApparentMagnitudes(double apparentMagnitudes) {
        this.apparentMagnitudes = apparentMagnitudes;
    }
    public void setTypes(String types) {
        this.types = types;
    }

    //Get
    public String getName() {
        return this.name;
    }
    public String getId() {
        return this.id;
    }
    public String getTypes() {
        return this.types;
    }
    public double getApparentMagnitudes() {
        return this.apparentMagnitudes;
    }
    public double getDistance() {
        return this.distance;
    }

    //Aufgabe e)
    public boolean isCloserThan(Star other){
        if(distance < other.distance) {
            return true;
        }
        return false;

    }

    public double getDistanceInPC(){
        final double LY = 3.26;
        return distance / LY;
    }

    public double getAbsoluteMagnitude(){
        double m = apparentMagnitudes;
        return m - 5 * Math.log10(getDistanceInPC()) + 5;
    }

    public boolean checkType(){

        double magnitude = getAbsoluteMagnitude();

        if (15 <= magnitude && 20 >= magnitude){
            return checkerType("Brown dwarf", types);

        }else if (10 <= magnitude && 15 > magnitude){
            return checkerType("Red dwarf", types) || checkerType("White dwarf", types);

        }else if (5 <= magnitude && 10 > magnitude){
            return checkerType("Subdwarf", types);

        }else if (0 <= magnitude && 5 > magnitude){
            return checkerType("Main sequence", types) || checkerType("Subgiant", types);

        }else if (-5 <= magnitude && 0 > magnitude){
            return checkerType("Giant", types) || checkerType("Bright giant", types);

        }else if (-10 <= magnitude && -5 > magnitude){
            return checkerType("Blue supergiant", types) || checkerType("Yellow supergiant", types) || checkerType("Red supergiant", types) || checkerType("Hypergiant", types);
        }

        return false;
    }

    private boolean checkerType (String wert1, String wert2){
         if(wert1.equals(wert2)){
             return true;
         }
        return false;
    }



}


//sonne.setName("sonne");