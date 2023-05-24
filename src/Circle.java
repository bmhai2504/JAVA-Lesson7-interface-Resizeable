public class Circle extends Shape implements Resizeable{
    private double radius = 1;

    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "color='" + getColor() + '\'' +
                ", isFilled=" + isFilled() +
                ", radius=" + radius +
                '}';
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius() * percent);
    }
}
