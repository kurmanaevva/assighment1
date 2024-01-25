// MyApplication class to test the Point and Shape classes
public class MyApplication {
    public static void main(String[] args) {
        // 10 random points
        Point[] points = {
                new Point(3, 4),
                new Point(5, 6),
                // Add more points as needed
        };

        //shape using the points
        Shape myShape = new Shape(points);

        // Test the methods
        System.out.println("Perimeter: " + myShape.perimeter());
        System.out.println("Longest Side: " + myShape.longestSide());
        System.out.println("Average Side: " + myShape.averageSide());
    }
}