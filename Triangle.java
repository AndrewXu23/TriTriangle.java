public class Triangle extends AbstractShape{
    private Point2D points1;
    private Point2D points2;

    //constructor
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) throws IllegalArgumentException{
        super(new Point2D(x1, y1));
        this.points1 = new Point2D(x2, y2);
        this.points2 = new Point2D(x3, y3);
        if(reference.distToOtherPoint(points1) == 0 | reference.distToOtherPoint(points2) == 0 | points1.distToOtherPoint(points2) == 0){
            throw new IllegalArgumentException("Points must be unique!");
        }
    }

    public Triangle(Point2D reference, Point2D points1, Point2D points2) throws IllegalArgumentException{
        super(new Point2D(reference.getX(), reference.getY()));
        this.points1 = points1;
        this.points2 = points2;
        if (reference.distToOtherPoint(points1) == 0 | reference.distToOtherPoint(points2) == 0 | points1.distToOtherPoint(points2) == 0){
            throw new IllegalArgumentException("Points must be unique!");
        }
    }
    @Override
    public double perimeter() {
        double side1 = reference.distToOtherPoint(points1);
        double side2 = reference.distToOtherPoint(points2);
        double side3 = points1.distToOtherPoint(points2);
        return side1 + side2 + side3;
    }

    @Override
    public double area() {
        double side1 = reference.distToOtherPoint(points1);
        double side2 = reference.distToOtherPoint(points2);
        double side3 = points1.distToOtherPoint(points2);
        double i = (side1 + side2 + side3) / 2;
        return Math.sqrt(i * (i - side1) * (i - side2) * (i - side3));
    }

    @Override
    public Shape resize(double factor) {
        Point2D newPoint1 = points1.change(reference, Math.sqrt(factor));
        Point2D newPoint2 = points2.change(reference, Math.sqrt(factor));
        return new Triangle(reference, newPoint1, newPoint2);
    }

    @Override
    public String toString(){
        return "(" + reference.toString() + " , " + points1.toString() + " , " + points2.toString() + ")";
    }
    }













