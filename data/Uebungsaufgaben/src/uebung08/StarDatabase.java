package uebung08;

public class StarDatabase {
    Star[] starArray = new Star[0];

    //Konstruktur
    public StarDatabase() {

    }

    //Methoden
    public void add(Star star) {
        //Kopiere das "starArray" nach "starArrayNew", welches 1 Index mehr hat.
        int laenge = starArray.length;
        Star[] starArrayNew = new Star[laenge + 1];

        for (int i = 0; i < laenge; i++) {
            starArrayNew[i] = starArray[i];
        }
        starArrayNew[laenge] = star;

        starArray = new Star[laenge + 1];

        for (int i = 0; i <= laenge; i++) {
            starArray[i] = starArrayNew[i];
        }
    }

    public void remove(int index) {

        int laenge = starArray.length;

        if (index < laenge && index >= 0){
            Star[] starArrayNew = new Star[laenge - 1];

            for (int i = 0; i < index; i++){
                starArrayNew[i] = starArray[i];
            }
            for (int i = index + 1; i < laenge; i++ ) {
                starArrayNew[i-1] = starArray[i];
            }

            laenge = starArrayNew.length;
            starArray = new Star[laenge];

            for (int i = 0; i < laenge; i++) {
                starArray[i] = starArrayNew[i];
            }

            int i = 0;

        }else {
            System.out.println("ERROR by remove: INDEX OUT OF BOUNDS; Bitte Eingabe checken!");
        }


    }

    public Star get(int index) {
        if (index < starArray.length && index >= 0) {
            return starArray[index];
        }
        return null;
    }

    public int size() {

        return starArray.length;
    }


    //Aufgabenteil c)

    public Star find(String id){
        for (Star starSuche: starArray) {
            if(starSuche.getId().equals(id)){
                return starSuche;
            }
        }
        return null;
    }
    //Aufgabenteil d)

    public Star[] getMagnituderange(double low, double high){
        Star[] suchErgebnis = new Star[starArray.length];

        int i = 0;
        for (Star starSuche: starArray) {
            if(low <= starSuche.getApparentMagnitudes() && high >= starSuche.getApparentMagnitudes()){
                suchErgebnis[i] = starSuche;
                i++;
            }

        }
        return suchErgebnis;
    }
}
