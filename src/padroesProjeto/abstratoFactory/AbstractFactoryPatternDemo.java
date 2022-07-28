package padroesProjeto.abstratoFactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();

		System.out.println("#-------------------------------#");
		
		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
		
		Shape roundedrectangle = shapeFactory1.getShape("ROUNDEDRECTANGLE");
		roundedrectangle.draw();
		Shape roundedsquare = shapeFactory1.getShape("ROUNDEDSQUARE");
		roundedsquare.draw();
	}

}
