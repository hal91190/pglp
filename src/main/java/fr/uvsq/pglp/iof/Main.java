package fr.uvsq.pglp.iof;

public class Main {
  public static double area(Shape shape) {
    //
    // DONT'T DO THAT !!!!!
    //
    if (shape instanceof Circle) {
      Circle c = (Circle) shape;
      return Math.PI * c.getRadius() * c.getRadius();
    } else if (shape instanceof Square) {
      Square s = (Square) shape;
      return s.getSide() * s.getSide();
    }
    return 0.0;
  }
}
