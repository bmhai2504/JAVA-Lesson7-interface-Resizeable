public class Rectangle extends Shape implements Resizeable{
    private double width = 1;
    private double height = 1;

    public Rectangle(){
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(String color, boolean filled, double width, double height){
        super(color,filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "color='" + getColor() + '\'' +
                ", isFilled=" + isFilled() +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public void resize(double percent) {
        setHeight(getHeight() * percent);
        setWidth(getWidth() * percent);
    }
}
