package AbstactFactoryPattern;

/**
 * @author bhuang
 * @date 2018/02/12
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if("Rectangle".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }
        if("Square".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        if("Circle".equalsIgnoreCase(shapeType)){
            return new Circle();
        }
        return null;
    }
    @Override
    Color getColor(String color) {
        return null;
    }
}
