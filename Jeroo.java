/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {
    // Put any methods here
    public void testLetterH() {
      hop();
      turn(LEFT);
      turn(LEFT);
      turn(LEFT);
      hop();
      plant();
      hop();
      plant();
      hop();
      plant();
      hop();
      plant();
      hop();
      plant();
      turn(LEFT);
      hop();
      turn(LEFT);
      hop();
      hop();
      plant();
      turn(LEFT);
      turn(LEFT);
      turn(LEFT);
      hop();
      plant();
      hop();
      turn(LEFT);
      hop();
      hop();
      plant();
      turn(LEFT);
      turn(LEFT);
      hop();
      plant();
      hop();
      plant();
      hop();
      plant();
      hop();
      plant();
      hop();

    }

    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
