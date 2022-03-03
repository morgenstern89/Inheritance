package abstract_example;

public class Rectangle extends Shape{
     int a;
     int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int area() {
        return a*b;
    }

    @Override
    public String shapeInfo() {
        return super.shapeInfo() +"rectangle";
    }

    public int someMethod(){
        return 0;
    }
}
