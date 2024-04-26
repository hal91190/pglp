package fr.uvsq.pglp.iofpm;

public class Main {
  // tag::area-method[]
  public static double area(Shape shape) {
    if (shape instanceof Circle c) { //<1>
      return Math.PI * c.getRadius() * c.getRadius();
    } else if (shape instanceof Square s) {
      return s.getSide() * s.getSide();
    }
    return 0.0; //<2>
  }
  // end::area-method[]
}
