// Point class represents a 2D point with x and y coordinates
public class Point {
    private double x;
    private double y;

    // Constructor to initialize a point with given x and y coordinates
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Calculate and return the distance from the current point to the destination point
    public double distanceTo(Point destination) {
        double deltaX = destination.x - this.x;
        double deltaY = destination.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // a string representation of the point in the format (x, y)
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}