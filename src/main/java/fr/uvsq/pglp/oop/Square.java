package fr.uvsq.pglp.oop;

public class Square implements Shape {
  private final Point origin;
  private final double side;

  public Square(Point origin, double side) {
    this.origin = origin;
    this.side = side;
  }

  @Override
  public double area() {
    return side * side;
  }
}
