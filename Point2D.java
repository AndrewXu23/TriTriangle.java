/**
 * This class represents a 2D point. This point is denoted in Cartesian
 * coordinates as (x,y).
 */
import static java.lang.Math.*;
public class Point2D {
  private double x;
  private double y;

  /**
   * Construct a 2d point with the given coordinates
   *
   * @param x the x-coordinate of this point
   * @param y the y-coordinate of this point
   */
  public Point2D(double x, double y) {
    this.x = x;
    this.y = y;
  }
  public double distToOtherPoint(Point2D other) {
    return Math.sqrt((this.x - other.x) * (this.x - other.x) + (this.y - other.y) * (this.y - other.y));
  }
  /**
   * Compute and return the Euclidean distance of this point to the origin
   *
   * @return the euclidean distance
   */

  public double distToOrigin() {
    return Math.sqrt(x * x + y * y);
  }

  /**
   * Return the x-coordinate of this point
   *
   * @return x-coordinate of this point
   */
  public double getX() {
    return x;
  }

  /**
   * Return the y-coordinate of this point
   *
   * @return y-coordinate of this point
   */
  public double getY() {
    return y;
  }

  public Point2D change(Point2D reference, double factor) {
    return new Point2D((this.x - reference.x) * factor + reference.x,
            (this.y - reference.y) * factor + reference.y);
  }

  public String toString(){
    return "(" + this.x + "," + this.y + ")";
  }
}