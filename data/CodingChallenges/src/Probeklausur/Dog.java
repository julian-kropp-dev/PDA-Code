package Probeklausur;

public class Dog {
    private boolean hungry;
    private String name;
    private boolean wedelnMitSchwanz;

    public Dog(String name) {
        this.name = name;

    }



    public void setWedelnMitSchwanz(boolean wedelnMitSchwanz) {
        this.wedelnMitSchwanz = wedelnMitSchwanz;
    }

    public boolean wagTail() {
        System.out.println(name + " wags its tail.");
        return wedelnMitSchwanz;
    }

    public boolean isHungry() {
        return hungry;
    }

    public String getName() {
        return name;
    }

    public void setHungry(boolean hungry) {
        if (hungry) System.out.println(name + " is getting hungry.");
        if (!hungry) System.out.println(name + "is not hungry anymore.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean eat() {
        if (hungry) {
            System.out.println(name + " is eating.");
            setHungry(false);
            return true;
        } else {
            System.out.println(name + " is not hungry.");
            return false;
        }
    }

    public void bark() {
        System.out.println(name + " goes 'whuff.'");
    }

}

