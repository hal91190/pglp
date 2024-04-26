package fr.uvsq.pglp.sealint;

public final class Circle implements Shape {
  private final Point center;
  private final double radius;

  public Circle(Point center, double radius) {
    this.center = center;
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }
}
