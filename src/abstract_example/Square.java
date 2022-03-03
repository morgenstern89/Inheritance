package abstract_example;

public class Square extends Rectangle{
    public Square(int a) {
        super(a, a);
    }

    @Override
    public String shapeInfo() {
        return "Area" +area()+" square";
    }
    @Override
    public final int someMethod(){
        return 0;
    }
}
