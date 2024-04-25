package fr.uvsq.pglp.oop;

public class Circle implements Shape {
  private final Point center;
  private final double radius;

  public Circle(Point center, double radius) {
    this.center = center;
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }
}
