public class Cylinder extends Circle{
    private double height;


    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height > 0 ? height : 0;
    }

    public double getVolume(){
        return getArea() * height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
