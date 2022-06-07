package Class_rectangle;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {

    }

    public Rectangle(double weight, double height) {
        this.width = weight;
        this.height = height;
    }

    public double getWeight() {
        return width;
    }

    public void setWeight(double weight) {
        this.width = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.height*this.width;
    }

    public  double getPerimeter(){
        return (this.width + this.height) * 2;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
