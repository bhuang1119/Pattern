package AbstactFactoryPattern;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if("Red".equalsIgnoreCase(color)) {
            return new Red();
        }
        if("Black".equalsIgnoreCase(color)) {
            return new Black();
        }
        if("Yellow".equalsIgnoreCase(color)) {
            return new Yellow();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
