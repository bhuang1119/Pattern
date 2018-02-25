package AbstactFactoryPattern;

/**
 * @author bhuang
 * @date 2018/2/13
 */
public class AbsractFactoryPatternDemo {
    public static void main(String[] args){
        AbstractFactory sf = FactoryProducer.getFactory("Shape");
        Shape  Rectangle = sf.getShape("Rectangle");
        Shape Square = sf.getShape("Square");
        Shape  Circle = sf.getShape("Circle");
        Rectangle.draw();
        Square.draw();
        Circle.draw();
        AbstractFactory cf = FactoryProducer.getFactory("Color");
        Color Red = cf.getColor("Red");
        Color Yellow = cf.getColor("Yellow");
        Color Black = cf.getColor("Black");
        Red.fill();
        Yellow.fill();
        Black.fill();
    }

}
