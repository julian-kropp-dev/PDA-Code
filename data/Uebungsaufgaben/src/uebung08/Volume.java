package uebung08;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {

        Cube cube = new Cube(inputcubelength());
        Sphere sphere = new Sphere(inputsphereradius());

        System.out.println("Volumen des Würfels: " + cube.getVolume());
        System.out.println("Volumen der Kugel: " + sphere.getVolume());
        System.out.println("Differenz: " + Math.abs(cube.getVolume() - sphere.getVolume()));
        System.out.println("Wie lautet der Inkrement Wert?");

        double increment = inputincrement();
        int step = 0;

        if (sphere.getVolume() > cube.getVolume()) {
            while (sphere.getVolume() > cube.getVolume()) {
                cube.change(increment);
                sphere.change(-1 * increment);
                step++;
            }
            System.out.println("In " + step + " Schritten:");
            System.out.println("Volumen des Würfels: " + cube.getVolume());
            System.out.println("Volumen der Kugel: " + sphere.getVolume());
            System.out.println("Oberfläche des Würfels: " + cube.getSurfaceArea());
            System.out.println("Oberfläche der Kugel: " + sphere.getSurfaceArea());
        }
        else {
            while (sphere.getVolume() < cube.getVolume()) {
                cube.change(-1 * increment);
                sphere.change(increment);
                step++;
            }
            System.out.println("In " + step + " Schritten:");
            System.out.println("Das Volumen des Würfels beträgt: " + cube.getVolume());
            System.out.println("Das Volumen der Kugel beträgt: " + sphere.getVolume());
            System.out.println("Die Oberfläche des Würfels beträgt: " + cube.getSurfaceArea());
            System.out.println("Die Oberflächeder Kugel beträgt: " + sphere.getSurfaceArea());
        }

    }

    public static double inputcubelength() {
        Scanner scanner = new Scanner(System.in);
        double edgelength;
        do {
            System.out.println("Kantenlänge des Würfels? ");
            while (!scanner.hasNextDouble()) {
                System.out.println(
                        "Invalid user input. Please try again.");
                scanner.next();
            }
            edgelength = scanner.nextDouble();
        } while (edgelength <= 0);
        return edgelength;
    }

    public static double inputsphereradius() {
        Scanner scanner = new Scanner(System.in);
        double radius;
        do {
            System.out.println("Radius der Kugel:");
            while (!scanner.hasNextDouble()) {
                System.out.println(
                        "Invalid user input. Please try again.");
                scanner.next();
            }
            radius = scanner.nextDouble();
        } while (radius <= 0);
        return radius;
    }

    public static double inputincrement() {
        Scanner sci = new Scanner(System.in);
        double increment;
        do {
            System.out.println("Inkrement Wert:");
            while (!sci.hasNextDouble()) {
                System.out.println("Invalid user input. Please try again");
                sci.next();
            }
            increment = sci.nextDouble();
        } while (increment <= 0);
        return increment;
    }

}
