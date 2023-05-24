public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(100, 10);

        System.out.println("Before resize: ");
        for (Shape element : shapes){
            System.out.println(element);
        }

        System.out.println("After resize: ");
        ((Circle)shapes[0]).resize(0.1);
        ((Rectangle)shapes[1]).resize(0.1);
        for (Shape element : shapes){
            System.out.println(element);
        }
    }
}