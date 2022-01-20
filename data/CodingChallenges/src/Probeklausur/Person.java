package Probeklausur;

public class Person {
    private String name;
    private Dog[] dogs;

    public Person(String name) {
        this.name = name;

    }

    public boolean feedDog(Dog dog) {
        if (dog.isHungry()) {
            System.out.println(name + " feeds " + dog.getName() + " .");
            return true;
        } else return false;
    }

    public void feedAllDogs() {
        for (Dog dog : dogs) {
            dog.setHungry(false);
        }
        System.out.println(name + "feeds their dogs.");
    }

    public void pet(Dog dog) {
        System.out.println(name + " pets " + dog.getName());
        dog.setWedelnMitSchwanz(true);
    }


}

