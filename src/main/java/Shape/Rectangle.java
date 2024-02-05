package Shape;

import Point.Point2d;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class Rectangle extends BaseShape {
    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        double halfOfWidth = width / 2;
        double halfOfHeight = height / 2;

        Collection<Point2d> rectangleCoordinates = new ArrayList<>();

        int numPointsWidth = (int) Math.ceil(width / 0.5); // 10
        int numPointsHeight = (int) Math.ceil(height / 0.5); // 5

        for (int i = 0; i < numPointsWidth; i++) {
            double x = -halfOfWidth + i * 0.5;
            for (int j = 0; j < numPointsHeight; j++) {
                double y = -halfOfHeight + j * 0.5;
                rectangleCoordinates.add(new Point2d(x, y));
            }
        }

        this.addAll(rectangleCoordinates);
    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        double halfOfWidth = dimensions.X() / 2;
        double halfOfHeight = dimensions.Y() / 2;

        Collection<Point2d> rectangleCoordinates = new ArrayList<>();

        int numPointsWidth = (int) Math.ceil(halfOfWidth*2 / 0.5);
        int numPointsHeight = (int) Math.ceil(halfOfHeight*2 / 0.5);

        for (int i = 0; i < numPointsWidth; i++) {
            double x = -halfOfWidth + i * 0.5;
            for (int j = 0; j < numPointsHeight; j++) {
                double y = -halfOfHeight + j * 0.5;
                rectangleCoordinates.add(new Point2d(x, y));
            }
        }

        this.addAll(rectangleCoordinates);
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        // Calculate the width and height using the coordinates
        double minX = Double.MAX_VALUE;
        double minY = Double.MAX_VALUE;
        double maxX = -Double.MAX_VALUE;
        double maxY = -Double.MAX_VALUE;

        for (Point2d point : coords) {
            minX = Math.min(minX, point.X());
            minY = Math.min(minY, point.Y());
            maxX = Math.max(maxX, point.X());
            maxY = Math.max(maxY, point.Y());
        }

        double widthValue = maxX - minX;
        double heightValue = maxY - minY;

        double halfOfWidth = widthValue / 2;
        double halfOfHeight = heightValue / 2;

        Collection<Point2d> rectangleCoordinates = new ArrayList<>();

        int numPointsWidth = (int) Math.ceil(halfOfWidth*2 / 0.5);
        int numPointsHeight = (int) Math.ceil(halfOfHeight*2 / 0.5);

        for (int i = 0; i < numPointsWidth; i++) {
            double x = -halfOfWidth + i * 0.5;
            for (int j = 0; j < numPointsHeight; j++) {
                double y = -halfOfHeight + j * 0.5;
                rectangleCoordinates.add(new Point2d(x, y));
            }
        }

        this.addAll(rectangleCoordinates);

    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
    Collection<Point2d> newCollection = new ArrayList<>();
    for (Point2d point : this.getCoords()) {
        newCollection.add(point.clone());
    }
    return new Rectangle(newCollection);

    }
}
