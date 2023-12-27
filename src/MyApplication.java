public class MyApplication {
    public static void main(String[] args) {
        Point[] points = {
                new Point(2, 3),
                new Point(4, 5),
        };
        Shape myShape = new Shape(points);
        System.out.println("Perimeter: " + myShape.perimeter());
        System.out.println("Longest Side: " + myShape.longestSide());
        System.out.println("Average Side: " + myShape.averageSide());
    }
}