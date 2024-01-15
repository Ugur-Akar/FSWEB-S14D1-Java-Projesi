public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double w, double l, double h){
        super(w,l);
        height = checkDimension(h);
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return  getArea() * height;
    }
}
