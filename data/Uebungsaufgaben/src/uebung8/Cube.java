package uebung8;

public class Cube {

    private double edgeLength = 0D;

    public Cube(double edgeLength) {

        edgeLength = edgeLength;
    }

    public double length() {

        return edgeLength;
    }

    public double getSurfaceArea() {
        double area;
        area = 6 * edgeLength * edgeLength;
        return area;
    }

    public double getVolume() {
        double volume;
        volume = edgeLength * edgeLength * edgeLength;
        return volume;
    }

    public void change(double increment) {

        edgeLength += increment;
    }

}
