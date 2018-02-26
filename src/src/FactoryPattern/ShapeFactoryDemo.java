package FactoryPattern;

public class ShapeFactoryDemo {
    public static void main(String[] args){
        ShapeFactory sf = new ShapeFactory();
        Shape sh1 = sf.getShape("Rectangle");
        Shape sh2 = sf.getShape("Square");
        Shape sh3 = sf.getShape("Circle");
        sh1.draw();
        sh2.draw();
        sh3.draw();

    }
}
