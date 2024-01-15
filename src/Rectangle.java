public class Rectangle {
    private double width, length;

    public Rectangle(double w, double l){
        width = checkDimension(w);
        length = checkDimension(l);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    double checkDimension(double d){
        return d > 0 ? d : 0;
    }

    public double getArea(){
        return  width * length;
    }

}
