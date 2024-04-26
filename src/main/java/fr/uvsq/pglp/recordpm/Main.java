package fr.uvsq.pglp.recordpm;

public class Main {
  // tag::area-method[]
  public static double area(Shape shape) {
    return switch (shape) {
      case Circle(_, double radius) -> Math.PI * radius * radius; //<1>
      case Square(_, double side) -> side * side;
    };
  }
  // end::area-method[]
}
