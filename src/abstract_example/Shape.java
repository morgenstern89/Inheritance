package abstract_example;

public abstract class Shape {
    public abstract int area();

    public String shapeInfo(){return "Area" + area();}
    public String drawShape(Shape shape){
        return "drawing";
    }
}
