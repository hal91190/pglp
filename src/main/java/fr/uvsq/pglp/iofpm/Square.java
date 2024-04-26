package fr.uvsq.pglp.iofpm;

public class Square implements Shape {
  private final Point origin;
  private final double side;

  public Square(Point origin, double side) {
    this.origin = origin;
    this.side = side;
  }

  public double getSide() {
    return side;
  }
}
