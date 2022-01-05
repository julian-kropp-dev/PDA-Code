package uebung9.car;

public class Car {
    private Reifen[] reifen;
    private Motor motor;
    private Kofferraum kofferraum;
    private double hoechstgeschwindigkeit;
    private int sitze;
    private int tueren;

    public Car(){

    }

    //getter

    public Reifen[] getReifen() {
        return reifen;
    }

    public Motor getMotor() {
        return motor;
    }

    public Kofferraum getKofferraum() {
        return kofferraum;
    }

    public double getHoechstgeschwindigkeit() {
        return hoechstgeschwindigkeit;
    }

    public int getSitze() {
        return sitze;
    }

    public int getTueren() {
        return tueren;
    }

    //setter


    public void setReifen(Reifen[] reifen) {
        this.reifen = reifen;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setKofferraum(Kofferraum kofferraum) {
        this.kofferraum = kofferraum;
    }

    public void setHoechstgeschwindigkeit(double hoechstgeschwindigkeit) {
        this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;
    }

    public void setSitze(int sitze) {
        this.sitze = sitze;
    }

    public void setTueren(int tueren) {
        this.tueren = tueren;
    }

    //features

    public boolean isFasterThanOtherCar(Car otherCar) {
        return otherCar.getHoechstgeschwindigkeit() < getHoechstgeschwindigkeit();
    }

    public boolean erfolgreichReifenErsetzt(int index, Reifen neu){
        reifen[index] = neu;
        return false;
    }


}
