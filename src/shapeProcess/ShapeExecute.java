package shapeProcess;
import shapePack.*;

public class ShapeExecute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square SQ = new Square();
		SemiCircle SC = new SemiCircle();
		
		SQ.printShape();
		SQ.printRectangle();
		SQ.printSquare();
		System.out.println("---------------------------------------");
		SC.printShape();
		SC.printSemiCircle();
		SC.printCircle();

	}

}
