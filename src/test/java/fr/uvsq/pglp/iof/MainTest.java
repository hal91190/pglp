package fr.uvsq.pglp.iof;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
  public static final Point ORIGIN = new Point(0.0, 0.0);
  private static final double THRESHOLD = 1E-5;

  static Stream<Arguments> testCasesForArea() {
    return Stream.of(
        Arguments.of(new Circle(ORIGIN, 2.0), 12.566371),
        Arguments.of(new Circle(ORIGIN, 0.5), 0.785398),
        Arguments.of(new Square(ORIGIN, 2.0), 4.0),
        Arguments.of(new Square(ORIGIN, 6.0), 36.0)
    );
  }

  @ParameterizedTest
  @MethodSource("testCasesForArea")
  public void shouldCalculateAreas(Shape shape, double area) {
    assertEquals(Main.area(shape), area, THRESHOLD);
  }
}
