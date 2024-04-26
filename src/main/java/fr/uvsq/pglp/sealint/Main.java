package fr.uvsq.pglp.sealint;

public class Main {
  // tag::area-method[]
  public static double area(Shape shape) {
    return switch (shape) { //<1>
      case Circle c -> Math.PI * c.getRadius() * c.getRadius(); //<2>
      case Square s -> s.getSide() * s.getSide();
    }; //<3>
  }
  // end::area-method[]
}
