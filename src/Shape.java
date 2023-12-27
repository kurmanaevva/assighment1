public class Shape {
    private Point[] points;
    public Shape(Point[] points) {
        this.points = points;
    }
    public double perimeter() {
        double perimeter = 0;
        int numPoints = points.length;

        for (int i = 0; i < numPoints; i++) {
            Point currentPoint = points[i];
            Point nextPoint = points[(i + 1) % numPoints];
            perimeter += currentPoint.distanceTo(nextPoint);
        }

        return perimeter;
    }
    public double longestSide() {
        double longestSide = 0;

        for (int i = 0; i < points.length; i++) {
            Point currentPoint = points[i];
            Point nextPoint = points[(i + 1) % points.length];
            double sideLength = currentPoint.distanceTo(nextPoint);

            if (sideLength > longestSide) {
                longestSide = sideLength;
            }
        }
        return longestSide;
    }
    public double averageSide() {
        double totalSideLength = 0;
        int numSides = points.length;
        for (int i = 0; i < numSides; i++) {
            Point currentPoint = points[i];
            Point nextPoint = points[(i + 1) % numSides];
            totalSideLength += currentPoint.distanceTo(nextPoint);
        }

        return totalSideLength / numSides;
    }
}