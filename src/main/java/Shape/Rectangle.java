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

        int numberOfPointsOfWidth = (int) Math.ceil(width / 0.5);
        int numberOfPointsOfHeight = (int) Math.ceil(height / 0.5);

        for (int i = 0; i < numberOfPointsOfWidth; i++) {
            double xCoordinate = -halfOfWidth + i * 0.5;
            for (int j = 0; j < numberOfPointsOfHeight; j++) {
                double yCoordinate = -halfOfHeight + j * 0.5;
                rectangleCoordinates.add(new Point2d(xCoordinate, yCoordinate));
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

        int numberOfPointsOfWidth = (int) Math.ceil(halfOfWidth*2 / 0.5);
        int numberOfPointsOfHeight = (int) Math.ceil(halfOfHeight*2 / 0.5);

        for (int i = 0; i < numberOfPointsOfWidth; i++) {
            double xCoordinate = -halfOfWidth + i * 0.5;
            for (int j = 0; j < numberOfPointsOfHeight; j++) {
                double yCoordinate = -halfOfHeight + j * 0.5;
                rectangleCoordinates.add(new Point2d(xCoordinate, yCoordinate));
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
        double minValueOfX = Double.MAX_VALUE;
        double minValueOfY = Double.MAX_VALUE;
        double maxValueOfX = -Double.MAX_VALUE;
        double maxValueOfY = -Double.MAX_VALUE;

        for (Point2d point : coords) {
            minValueOfX = Math.min(minValueOfX, point.X());
            minValueOfY = Math.min(minValueOfY, point.Y());
            maxValueOfX = Math.max(maxValueOfX, point.X());
            maxValueOfY = Math.max(maxValueOfY, point.Y());
        }

        double valueOfWidth = maxValueOfX - minValueOfX;
        double valueOfHeight = maxValueOfY - minValueOfY;

        double halfOfWidth = valueOfWidth / 2;
        double halfOfHeight = valueOfHeight / 2;

        Collection<Point2d> rectangleCoordinates = new ArrayList<>();

        int numberOfPointsOfWidth = (int) Math.ceil(halfOfWidth*2 / 0.5);
        int numberOfPointsOfHeight = (int) Math.ceil(halfOfHeight*2 / 0.5);

        for (int i = 0; i < numberOfPointsOfWidth; i++) {
            double xCoordinate = -halfOfWidth + i * 0.5;
            for (int j = 0; j < numberOfPointsOfHeight; j++) {
                double yCoordinate = -halfOfHeight + j * 0.5;
                rectangleCoordinates.add(new Point2d(xCoordinate, yCoordinate));
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
