package abstract_example;

public class Demo {
    public static void main(String[] args, Shape rectangle, Shape square) {
        Shape Rectangle  = new Rectangle(3, 4);
        Rectangle Square  = new Square (3);
        Shape square2 = new Square(1);

        Object object = new Object();
        System.out.println(rectangle.area());
        System.out.println(square.area());

        System.out.println(rectangle.shapeInfo());
        System.out.println(square.shapeInfo());
    }
}
