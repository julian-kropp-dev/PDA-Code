package uebung9.car;

public class Reifen {
    private double profilguete;
    private boolean platten;

    public Reifen(double profilguete, boolean platten){
        this.profilguete = profilguete;
        this.platten = platten;
    }

    //getter

    public double getProfilguete() {
        return profilguete;
    }

    public boolean getPlatten() {
        return platten;
    }

    //setter

    public void setProfilguete(double profilguete) {
        this.profilguete = profilguete;
    }

    public void setPlatten(boolean platten) {
        this.platten = platten;
    }
}
