package PrototypePattern;

public class PrototypePattrenDemo {
	public static void main(String[] args) {
		ShapeCache.loadCache();
		Shape clonedShape = ShapeCache.getShape("1");
		System.out.println("Shape:"+clonedShape.getType());
		
		ShapeCache.loadCache();
		Shape clonedShape2 = ShapeCache.getShape("2");
		System.out.println("Shape:"+clonedShape2.getType());
	
		ShapeCache.loadCache();
		Shape clonedShape3 = ShapeCache.getShape("3");
		System.out.println("Shape:"+clonedShape3.getType());
	
		/*ShapeCache.loadCache();
		Shape clonedShape4 = ShapeCache.getShape("4");
		System.out.println("Shape:"+clonedShape4.getType());
	*/

	}
}
